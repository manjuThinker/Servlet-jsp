package servletPackage;
import java.io.*;
import jakarta.servlet.*;


public class FirstServlet implements Servlet{

    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf) throws ServletException{
        this.conf=conf;
        System.out.println("Creating object");
    }
     @Override
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException
    {
        
        System.out.println("Servicing");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>hello world</h1>");
        out.println("<h1>new Date().toString()</h1>");
    }
    @Override
   public void destroy(){
       System.out.println("going to destroy");
   }
   @Override
   public ServletConfig getServletConfig(){
       return this.conf;
   }
   @Override
   public String getServletInfo(){
       return "this servlet is created by manjunath";
   }

    
}
