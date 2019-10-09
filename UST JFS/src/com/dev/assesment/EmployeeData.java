package com.dev.assesment;

public class EmployeeData {

	public static void main(String[] args) {
		MethodImplemention mi = new MethodImplemention();
		
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEname("Vignesh");
		e.setPassword("12345");
		e.setEmail("viggyvaithiar@gmail.com");
		e.setSalary(3000000);
		
		Employee e1 = new Employee();
		e1.setEmpid(2);
		e1.setEname("Vishal");
		e1.setPassword("17855");
		e1.setEmail("vishalv@gmail.com");
		e1.setSalary(800000);
		
		Employee e2 = new Employee();
		e1.setEmpid(3);
		e1.setEname("Aniket");
		e1.setPassword("37555");
		e1.setEmail("aniket@gmail.com");
		e1.setSalary(400000);
		
		boolean  b = mi.insertData(e.getEmpid(), e);
		System.out.println(b);
		
		boolean  b1 = mi.insertData(e1.getEmpid(), e1);
		System.out.println(b1);
		
		mi.searchEmployee(3);
		
		mi.searchEmployee(1);
		
		e.setEmail("viggy@gmail.com");
		boolean b3 = mi.updateData(1, e);
		
		mi.searchEmployee(1);
		
		mi.netPay(e.getSalary());
		
		mi.salGrade(e.getSalary());
		
		mi.removeEmployee(1);
		
	}

}
