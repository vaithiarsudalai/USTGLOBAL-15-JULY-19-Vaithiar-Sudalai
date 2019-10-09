package com.dev.methods;

public class MethodExample {

	public static void main(String[] args) {

		MethodExample me = new MethodExample();

		int area = calcArea(9);
		System.out.println("Area of square :"+area);
		int area1 = me.areaRec(5, 6);
		System.out.println("Area of rectangle :"+area1);

	}

	public int areaRec(int l, int b) {
		int area1 = l * b;
		return area1;

	}

	public static int calcArea(int side) {
		int area = side * side;
		return area;

	}

}
