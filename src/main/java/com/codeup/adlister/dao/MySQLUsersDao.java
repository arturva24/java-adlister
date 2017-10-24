package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.*;


public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config){

        try {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    } catch (SQLException e) {
        throw new RuntimeException("Error connecting to the database!", e);
    }
}

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try {
        PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                    return new User(
                            resultSet.getString("id"),
                            resultSet.getString("username"),
                            resultSet.getString("email"),
                            resultSet.getString("password")
                    );
                }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long insert(User user) {
        String sql = "INSERT INTO users (username, email, password) VALUES (?,?,?)";
        try {
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,user.getUsername());
            statement.setString(1,user.getEmail());
            statement.setString(1,user.getPassword());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            return resultSet.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
