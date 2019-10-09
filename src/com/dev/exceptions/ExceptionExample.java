package com.dev.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
//		double d = 10.0;
//		double q = 0.0;
//		System.out.println("Result : "+d/q);
		
		System.out.println("Print Before");
		t();
		System.out.println("Print After");

	}
	
	public static void s() {
		StringBuffer sb = new StringBuffer(-1);
	}
	
	public static void t() {
		s();
	}

}
