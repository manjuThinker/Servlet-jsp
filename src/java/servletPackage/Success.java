
package servletPackage;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author smanjuna
 */
public class Success extends HttpServlet{
    
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws 
            ServletException,IOException
    {
        resp.setContentType("text/html");
        
        PrintWriter out=resp.getWriter();
        out.println("<h2> Suceess of storing the form");
        
        String s1=String.valueOf(req.getParameter("firstName"));
        String s2=String.valueOf(req.getParameter("lastName"));
        String s3=String.valueOf(req.getParameter("email"));
       String s4=String.valueOf(req.getParameter("gender"));
      
         out.println("<h1>"+s1+"</h1>");
          out.println("<h1>"+s2+"</h1>");
           out.println("<h1>"+s3+"</h1>");
            out.println("<h1>"+s4+"</h1>");
            out.println("<h1>hiiiiiii</h1>");
       
    }
    
}
