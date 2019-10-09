package com.dev.inheritance;

public class GrandPa {
	static GrandPa gp = new GrandPa();
	
	String name = "Howard";
	String lastName = "Stark";
	
	public static void main(String[] args) {
		gp.printId();

	}

	public void printId( ) {
		System.out.println(name+" "+lastName);
	}
	
}
