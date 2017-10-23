


//loginservlet.java
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) { //can't use false, must use null; tests to see if session is null
            response.sendRedirect("/login.jsp");
        } else {
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        if (validAttempt) {
            HttpSession session = request.getSession();
            session.setAttribute("user", username); //username not in quotes so we can recognize it
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}