package servletPackage;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;



public class FirstServlet extends HttpServlet{
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
           ServletException,IOException{
       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
        String salutation =req.getParameter("salutation");
        String name =req.getParameter("firstName");
        String lastname =req.getParameter("lastName");
        String gender=req.getParameter("gender");
        String email=req.getParameter("email");
        
        
        if(email!=null && salutation!=null && name!=null
                && lastname !=null && gender!=null)
        {
            out.println("<h1>"+salutation+"</h1>");
            out.println("<h1>"+name+"</h1>");
            out.println("<h1>"+lastname+"</h1>");
            out.println("<h1>"+gender+"</h1>");
            out.println("<h1>"+email+"</h1>");
            out.println("<h1>"+lastname+"</h1>");
            RequestDispatcher rd=req.getRequestDispatcher("success");
            rd.forward(req, resp);
             
        }
        else{
            RequestDispatcher rd=req.getRequestDispatcher("index.html"); 
            rd.include(req, resp);
            out.println("<h2> fill all required fileds</h2>");
        }
        
   }

    
}
