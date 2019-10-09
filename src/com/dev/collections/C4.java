package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsule.Employee;

public class C4 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>(2);
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
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		System.out.println(al);
		
		al.trimToSize();
		System.out.println("Size of the ArrayList after trimToSize() : "+al.size());

	}

}
