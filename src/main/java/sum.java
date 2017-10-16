import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet", urlPatterns = "/sum")
public class sum  extends HttpServlet{
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        int a=0, b=0;
        a = Integer.parseInt(request.getParameter("a"));
        b = Integer.parseInt(request.getParameter("b"));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Sum res: " + (a+b) + "</h3>");
    }

}
