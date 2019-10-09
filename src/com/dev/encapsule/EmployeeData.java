package com.dev.encapsule;

public class EmployeeData {

	public static void main(String[] args) {
		
		Test t = new Test();
		
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
		
		boolean b = t.addEmployee("1", e);
		System.out.println(b);
		
		boolean b1 = t.addEmployee("2", e1);
		System.out.println(b1);
		
		t.getEmployee("1");
		
		t.getAllEmployee();
		
		boolean b3 = t.removeEmployee("2");
		System.out.println(b3);
		
		e.setName("Vighnesh");
		boolean b4 = t.updateData("1", e);
		System.out.println(b4);
		
		t.getEmployee("1");
		
		

	}

}
