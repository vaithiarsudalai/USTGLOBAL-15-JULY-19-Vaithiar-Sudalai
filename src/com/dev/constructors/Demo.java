package com.dev.constructors;
import com.dev.methods.MethodExample3;

public class Demo {
	
	static int j = 0;
	
	public static void main(String[] args) {
		int i = MethodExample3.calcArea(6);
		j = MethodExample3.calcArea(2);
	
		
		System.out.println(i);
		System.out.println(j);

	}

}
