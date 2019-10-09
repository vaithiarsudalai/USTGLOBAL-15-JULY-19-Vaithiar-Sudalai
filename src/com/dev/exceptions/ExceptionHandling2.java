package com.dev.exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) throws CustomException {
		try {
			s();
			System.out.println("No Exception for s()");
			int res = divide(10, 0);
			System.out.println("No Exception for divide()");
			System.out.println(res);
			
		} catch (NegativeArraySizeException e) {
			System.err.println("Exception Caught in catch block");
			System.err.println("getMessage() : "+e.getMessage());
			e.printStackTrace();
			
		}  catch (ArithmeticException e) {
			System.out.println("getMessage() 2 : "+new CustomException().getLocalizedMessage());
			//System.err.println("Exception Caught in catch block in arithmatic way");
			//System.err.println("getMessage() : "+e.getMessage());
			throw new CustomException();
			
			//e.printStackTrace();
			
		} finally {
			System.out.println("Finally Block");
		}
		
	}
	
	public static void s() {
		StringBuffer sb = new StringBuffer(1);
	}
	
	public static int divide(int i, int j) {
		int res = i / j;
		return res;
	}

}
