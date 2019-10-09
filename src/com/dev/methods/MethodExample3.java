package com.dev.methods;

public class MethodExample3 {

	public static int j = 0;

	static MethodExample me = new MethodExample();

	public static void main(String[] args) {

		j = calcArea(9);
		System.out.println("Area of square :"+j);
		int area1 = me.areaRec(5, 6);
		System.out.println("Area of rectangle :"+area1);
		

	}

	public int areaRec(int l, int b) {
		j = l * b;
		return j;
	}

	public static int calcArea(int side) {
		int t = side * side;
		j = me.areaRec(6, 3);
		System.out.println("Area of rectangle :"+j);
		return t;

	}

}
