package com.dev.encapsule;

import java.util.HashMap;
import java.util.Iterator;

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

	@Override
	public boolean removeEmployee(String s) {
		if (h != null) {
			h.remove(s);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void getAllEmployee() {
//		Iterator<String> iter = h.keySet().iterator();
//		while(iter.hasNext()) {
//			Employee g = h.get(iter.next());
//			System.out.println(g);
		System.out.println(h);
//		}
		
	}

	@Override
	public boolean updateData(String s, Employee d) {
		h.put(s, d);
		return true;
	}

}


