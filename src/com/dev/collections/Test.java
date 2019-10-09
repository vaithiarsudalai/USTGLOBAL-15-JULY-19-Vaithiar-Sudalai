package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsule.Employee;
import com.dev.encapsule.EmployeeMethods;

public class Test implements EmployeeMethods {
	
	HashMap<String, Employee> h = new HashMap<String, Employee>();
	
	@Override
	public boolean addEmployee(String s, Employee d) {
		if (d != null) {
			h.put(s, d);
			return true;
		} else {
		return false;
		}
	}

	@Override
	public void getEmployee(String s) {
		System.out.println(h.get(s)); 
	}

}
