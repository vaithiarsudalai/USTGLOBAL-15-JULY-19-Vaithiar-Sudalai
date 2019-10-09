package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		FunctInt f = () -> {
			for(int i = 1;i <= 10;i++) {
				System.out.println("i : "+i);
			}
		};

		FunctInt1 f1 = () -> System.out.println("This is lambda expression for without Scope");
		
		FunctInt3 f2 = () -> {
			try {
				StringBuffer sb = new StringBuffer(-1);
			} catch (Exception e) {
				System.out.println("Exception Occured");
			}
		};
		
		FunctInt2 f4 = (int i) -> {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
		};
		
		f.printVal();
		
		f1.displayVal();
		
		f2.exceptionDisplay();
		
		f4.printValue(5);

	}

} 
