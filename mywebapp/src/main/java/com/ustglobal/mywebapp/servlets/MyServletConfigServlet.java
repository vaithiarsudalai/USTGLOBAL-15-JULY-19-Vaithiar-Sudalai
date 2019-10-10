package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("name");
		
		ServletContext context = getServletContext();
		String myParam = context.getInitParameter("myParam");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Name from ServletConfig </br>");
		out.println(nameVal);
		out.println("<h2>Name from ServletContext </br>");
		out.println(myParam);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
	}

	
}
