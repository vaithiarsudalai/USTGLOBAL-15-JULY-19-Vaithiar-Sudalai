package com.ustglobal.mywebapp.dao;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean searchEmployee(int id);
	public boolean addEmployee(EmployeeInfoBean employee);
	public boolean updateEmployee(EmployeeInfoBean employee);
	public boolean deleteEmployee(int i);
	public EmployeeInfoBean login(int i,String password);

}
