import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloWorld", urlPatterns = "/sayhello")
public class HelloWorldServlet extends HttpServlet {
    private int hitCount;
    public void init(){
        hitCount = 0;
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        hitCount++;
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String title = "Total number of views ";
        out.println(title + hitCount);
//        out.println("<h1>Hello World!<h1>");

        if(name == null){
            out.println("<h2>Hello World!!</h2>");
        }else {
            out.println("<h2>Hello " + name + "</h2>");
        }


    }
}
