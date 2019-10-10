package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	EmployeeDAO dao = new EmployeeDaoJpaImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data 
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		String password = req.getParameter("password");
		
		EmployeeInfoBean employeeInfoBean = dao.login(empId, password);
		if(employeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfo", employeeInfoBean);
			resp.sendRedirect("./home.html");
		} else {
			resp.sendRedirect("./loginForm.html");
		}
	}

}
