package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		RequestDispatcher dispactcher = req.getRequestDispatcher("/welcome.html");
		dispactcher.include(req, resp);
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Its Include Servlet</br>");
		out.println("</h2>");
		out.println("<h2>Line 2</br>");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
