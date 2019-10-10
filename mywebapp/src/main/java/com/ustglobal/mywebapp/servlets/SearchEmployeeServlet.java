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
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/searchEmp")
public class SearchEmployeeServlet extends HttpServlet {
	EmployeeDAO dao = new EmployeeDaoJpaImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) 
		{
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			if (employeeInfoBean != null) {
				out.println("<h3>Employee Data for Employee Id : " + empId + " </h3>");
				out.println("<h3>Employee Id : " + employeeInfoBean.getEmpId() + " </h3>");
				out.println("<h3>Employee Name : " + employeeInfoBean.getEmpName() + " </h3>");
				out.println("<h3>Employee Age : " + employeeInfoBean.getAge() + " </h3>");
				out.println("<h3>Employee Salary : " + employeeInfoBean.getSalary() + " </h3>");
				out.println("<h3>Employee Designation : " + employeeInfoBean.getDesignation() + " </h3>");
			} else {
				out.println("<h3>Employee Record Not for Employee Id  " + empId + " </h3>");
			}
			out.println("</body>");
			out.println("</html>");
		} else {
			resp.sendRedirect("./loginForm.html");
		}

	}
}
