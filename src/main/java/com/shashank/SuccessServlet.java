package com.shashank;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {
       public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
       {
    	   res.setContentType("text/html");
    	   PrintWriter out=res.getWriter();
    	   out.println("<h1>After getting all enteries true in RegisterServlet</h1>");
    	   out.println("<h2>This is success servlet</h2>");
       }
}
