package com.dev.inheritance;

public class Boy extends Dad {
	static Boy b = new Boy();

	public void printId() {
		super.printId();
		
	}
	
	public static void main(String[] args) {
		b.printId();

	}

}
