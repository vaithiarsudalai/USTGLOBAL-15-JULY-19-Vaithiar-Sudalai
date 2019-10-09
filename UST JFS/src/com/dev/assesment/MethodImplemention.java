package com.dev.assesment;

import java.util.HashMap;

public class MethodImplemention implements EmployeeMethods {

	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();

	@Override
	public boolean insertData(int i, Employee em) {		
		Employee d = hm.put(i, em);
		System.out.println(hm);
		return true;
	}

	@Override
	public void searchEmployee(int i) {
		System.out.println("Searched Successfully : "+hm.get(i));
	}

	@Override
	public boolean removeEmployee(int i) {
		if (hm != null) {
			hm.remove(i);
			System.out.println("Employee Removed Successfully");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateData(int i, Employee em) {
		if(hm.containsKey(i)) {
			hm.put(i, em);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void netPay(double d) {
		if(d < 160000 && d >= 380000) {
			double i  = (d * 5.4) / 100;
			double y = d - i - 3187;
			System.out.println(y);
		} else 
			if(d < 380001 && d >= 540000) {
				double i  = (d * 7.34) / 100;
				double y = d - i - 3.765;
				System.out.println(y);

			} else 
				if (d < 540001 && d >= 860000) {
					double i  = (d * 8.19) / 100;
					double y = d - i - 4321;
					System.out.println(y);
				} else
					if (d < 860001 && d >= 1000000) {
						double i  = (d * 8.87) / 100;
						double y = d - i - 4876 ;
						System.out.println(y);
					} else if (d > 1000000 ) {
						double i  = (d * 9.35) / 100;
						double y = d - i - 5619 ;
						System.out.println(y);
					} else {
						System.out.println("Invalid Salary");
					}

	}

	@Override
	public void salGrade(double d) {
		if(d < 160000 && d >= 380000) {
			System.out.println("Salgrade is D");
		} else 
			if(d < 380001 && d >= 540000) {				
				System.out.println("Salgrade is C");
			} else 
				if (d < 540001 && d >= 860000) {					
					System.out.println("Salgrade is B");
				} else
					if (d < 860001 && d >= 1000000) {
						System.out.println("Salgrade is A");
					} else if (d > 1000000 ) {
						System.out.println("Salgrade is AA");
					} else {
						System.out.println("Invalid Salary");
					}



	}

}
