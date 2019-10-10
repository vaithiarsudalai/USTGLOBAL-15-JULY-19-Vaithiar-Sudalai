package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<head>");
		out.println("<body>");
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				out.println("<h2>Cookies Name = " + cookie.getName() + " </h2>");
				out.println("<h2>Cookies Value = " + cookie.getValue() + " </h2>");
			}
		} else {
			out.println("<h2>Cookie not found</h2>");

		}
		out.println("</head>");
		out.println("</html>");
		
	}

}
