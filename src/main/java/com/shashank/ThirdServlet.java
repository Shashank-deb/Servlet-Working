package com.shashank;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
//in httpServlet class we will get all the stuff in http protocol
//specially doGet(),doPost(),doPut() most important method of the HttpServlet Class
//which is the child class of GenericServlet and Servlet Interface
//this HttpServlet is protocol specified
	
	  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		  System.out.println("This is get Method of HttpServlet Class");
		  res.setContentType("text/html");
		  PrintWriter out=res.getWriter();
		  out.println("<h1>This is get Method of ThirdServlet class</h1>");
		  out.println("<h2>Todays date is: "+new Date().toString()+" ");
	  }
	  
	  
	  
	  
}
