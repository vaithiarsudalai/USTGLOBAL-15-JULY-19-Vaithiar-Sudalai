package com.ustglobal.usttyspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.usttyspringmvc.dao.EmployeeDAO;
import com.ustglobal.usttyspringmvc.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public Employee authenticate(String email, String password) {
		return dao.authenticate(email, password);
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (employee.getName() == null || employee.getEmail() == null || employee.getPassword() == null)
			return false;
		return dao.registerEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if (employee.getName() == null || employee.getEmail() == null || employee.getPassword() == null)
			return false;
		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
