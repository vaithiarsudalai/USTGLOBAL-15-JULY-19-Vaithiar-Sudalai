package com.dev.inheritance;

public class Son extends Father {
	
	static Son s = new Son();
	
	@Override
	public void printName( ) {
		String name = "Robb";
		System.out.println(name+" "+super.name+" "+s.lastName);
		super.printName();
	}

	public static void main(String[] args) {
		s.printName();
	}

}
