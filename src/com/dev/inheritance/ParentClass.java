package com.dev.inheritance;

public class ParentClass {
	static ParentClass pc = new ParentClass();
	
	public void name() {
		System.out.println("Superclass Print Statement");
	}
	
	private void name2 () {
		System.out.println("Superclass Print Statement 1");
	}
	
	final void name3 () {
		System.out.println("Superclass Print Statement 2");
	}
	
	public static void name5 () {
		System.out.println("Superclass Print Statement 3");
	}

	public static void main(String[] args) {
		pc.name();
		pc.name2();
		pc.name3();
		pc.name5();
		
	}

}
