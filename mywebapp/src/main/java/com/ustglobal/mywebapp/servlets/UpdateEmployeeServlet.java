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

@WebServlet("/updateEmp")
public class UpdateEmployeeServlet extends HttpServlet {

	EmployeeInfoBean employee = null;
	EmployeeDAO dao = new EmployeeDaoJpaImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			employee.setEmpId(empId);
			employee = dao.searchEmployee(empId);
			
			if (employee != null) {
				String empName = req.getParameter("empName");
				employee.setEmpName(empName);
				String ageVal = req.getParameter("age");
				int age = Integer.parseInt(ageVal);
				employee.setAge(age);
				String salaryVal = req.getParameter("salary");
				double salary = Double.parseDouble(salaryVal);
				employee.setSalary(salary);
				String designation = req.getParameter("designation");
				employee.setDesignation(designation);
				String password = req.getParameter("password");
				employee.setPassword(password);
				boolean update = dao.updateEmployee(employee);
				PrintWriter out = resp.getWriter();
				resp.setContentType("text/html");
				out.println("<html>");
				out.println("<body>");
			
				if (update) {
					out.println("<h2>Employee Updated Successfully</h2>");
				} else {
					out.println("<h2>Employee Not Update</h2>");
				}
				out.println("</body>");
				out.println("</html>");

			} else {
				resp.sendRedirect("./loginForm.html");
			}
		} else {
			resp.sendRedirect("./loginForm.html");
		}
	}
}
