package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/myAttributeValue")
public class MyAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) context.getAttribute("emp");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Employee Id " + employeeInfoBean.getEmpId() + " </h3>" );
		out.println("<h3>Employee Name " + employeeInfoBean.getEmpName() + " </h3>" );
		out.println("<h3>Employee Age " + employeeInfoBean.getAge() + " </h3>" );
		out.println("<h3>Employee Salary " + employeeInfoBean.getSalary() + " </h3>" );
		out.println("<h3>Employee Designation " + employeeInfoBean.getDesignation() + " </h3>" );
		out.println("</body>");
		out.println("</html>");
	}
}
