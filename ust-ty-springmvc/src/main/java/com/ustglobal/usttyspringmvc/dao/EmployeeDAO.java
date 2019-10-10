package com.ustglobal.usttyspringmvc.dao;

import java.util.List;

import com.ustglobal.usttyspringmvc.dto.Employee;

public interface EmployeeDAO {
	public Employee authenticate(String email, String password);
	public boolean registerEmployee(Employee employee);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee employee);
	public List<Employee> getAllEmployee();
}
