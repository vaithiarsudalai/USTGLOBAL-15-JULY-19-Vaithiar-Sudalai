package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsule.Employee;

public class C3 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee e = new Employee();
		e.setId(18);
		e.setName("Vignesh");
		e.setEmail("viggy@gmail.com");
		e.setPassword("viggy123");
		
		Employee e1 = new Employee();
		e1.setId(12);
		e1.setName("Vishal");
		e1.setEmail("vishal12@gmail.com");
		e1.setPassword("vishal294");
		
		Employee e2 = new Employee();
		e2.setId(20);
		e2.setName("Aniket");
		e2.setEmail("varmaniket@gmail.com");
		e2.setPassword("90299ani");
		
		ts.add(e);
		ts.add(e2);
		ts.add(e1);
		
		System.out.println(ts);

	}

}
