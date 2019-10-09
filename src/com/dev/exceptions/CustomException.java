package com.dev.exceptions;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("Exception Occured");
	}
	
	public CustomException(int i) {
		System.out.println("Interger Exception Occured");
	}
	
	public CustomException(String s) {
		System.out.println("String Exception Occured");
	}
	
	@Override
	public String getLocalizedMessage() {
		return "Custom Exception Occurred" ;
	}
}
