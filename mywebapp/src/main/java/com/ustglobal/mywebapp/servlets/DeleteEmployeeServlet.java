package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImpl;

@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet{
	
	EmployeeDAO dao = new EmployeeDaoJpaImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		if (session != null) {
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			boolean delete = dao.deleteEmployee(empId);
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			if (delete) {
				out.println("<h2>Employee Deleted Successfully</h2>");
			} else {
				out.println("<h2>Employee Not Deleted</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		} else {
			resp.sendRedirect("./loginForm.html");
		}
	}

}
