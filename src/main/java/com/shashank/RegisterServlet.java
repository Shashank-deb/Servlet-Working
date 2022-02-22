package com.shashank;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
        protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
        {
        	res.setContentType("text/html");
        	PrintWriter out=res.getWriter();
        	out.println("<h1>Welcome to Register Servlet</h1>");
        	String name=req.getParameter("user_name");
        	String password=req.getParameter("user_pass");
        	String email=req.getParameter("user_email");
        	String gender=req.getParameter("user_gender");
        	String course=req.getParameter("user_course");
        	String cond=req.getParameter("condition");
        	if(cond!=null)
        	{
        	if(cond.equals("checked"))
        	{
        		out.println("<h2>Name: "+name+"<h2>");
        		out.println("<h2>Password: "+password+"<h2>");
        		out.println("<h2>Email: "+email+"<h2>");
        		out.println("<h2>Gender: "+gender+"<h2>");
        		out.println("<h2>Course: "+course+"<h2>");
        		out.println("<h2>Condition : "+cond+"<h2>");
        		
        		
        		//this will forward the response to one servlet to another servlet
        		RequestDispatcher rd=req.getRequestDispatcher("success");
        		rd.forward(req, res);
        				
        	}
        	else
        	{
        		out.println("<h2>You have not accepted terms and condition</h2>");
        	}
           }
        	out.println("<h2>You have not accepted terms and conditions</h2>");
        	//i want to include output of index.html
        	//get the object of request dispatcher 
        	//the index.html is included to RegisterServlet
        	RequestDispatcher rd=req.getRequestDispatcher("index.html");
        	rd.include(req, res);
        	
        }
}
