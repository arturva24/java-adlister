import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MySQLAdsDao implements Ads {
    Connection connection = null;

    public MySQLAdsDao (){
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/movies_db",
//                    "movies_user",
//                    "password"
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error");
        }
    }

    public MySQLAdsDao(Config config) {
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {

        String query = "INSERT INTO ads(user_id, title, descritption) VALUES(";
        query += "1, ";
        query += "'" + ad.getTitle() + "'";
        query += "'" + ad.getDescription() + "'";
        query += ")";
        System.out.println("[DEBUG]: Running SQL..." + query);

        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            if(rs.next()){
                return rs.getLong(1);
            } else {
                throw new RuntimeException()
            }
        } catch (SQLException e) {
            throw new RuntimeException("error inserting an ad!", e);
        }


    }
}
