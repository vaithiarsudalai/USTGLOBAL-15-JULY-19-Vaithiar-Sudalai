package com.dev.inheritance;

public class Dad extends GrandPa {
	static Dad d = new Dad(); 
		
	public void printId() {
		super.printId();
	}
	
	public static void main(String[] args) {
		d.printId();

	}

}
