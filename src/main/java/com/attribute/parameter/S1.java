package com.attribute.parameter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		int s=nn1+nn2;
		req.setAttribute("sum", s);
		RequestDispatcher rd=req.getRequestDispatcher("S2");
		//this sum is forward to Servlet s2
		rd.forward(req, res);
	}

}
