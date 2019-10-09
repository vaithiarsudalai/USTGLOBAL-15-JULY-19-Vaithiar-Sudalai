package com.dev.methods;

public class MethodExample2 {

	public static void main(String[] args) {

		MethodExample me = new MethodExample();

		int area = MethodExample.calcArea(8);
		System.out.println("Area of square :"+area);
		int area1 = me.areaRec(5, 8);
		System.out.println("Area of rectangle :"+area1);

	}

}
