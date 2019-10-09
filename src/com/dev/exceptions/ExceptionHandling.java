package com.dev.exceptions;

public class ExceptionHandling extends CustomException {

	public static void main(String[] args) throws CustomException {
//		try {
//			s();
//		} catch (Exception e) {
//			System.out.println("Exception Occurred");          // Its important to have a catch block 
//			e.printStackTrace();
//		} finally {
//			System.out.println("This is finally block");
//		}
//		System.out.println("Code after Exception");
		s();
		System.out.println();
	}

	public static void s() throws CustomException {
		try {
			StringBuffer sb = new StringBuffer(-1);
		} catch (Exception e) {
			throw new CustomException();
		}
				
	}
}
