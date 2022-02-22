package com.shashank;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	//only one method service method is present
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> This is service method</h1>");
		out.println("Today date will be: "+new Date().toString()+" ");
	
	}

}
