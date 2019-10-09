package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();

	public void print() {
		System.out.println("This is print method with no-args");
	}

	public int print(int i) {
		System.out.println("This is print method with int arg");
		return 1;
	}

	private String print(String str) {
		System.out.println("This is print method with String args");
		return "A";
	}

	final int print(int s, int t, int r) {
		System.out.println("This is print method with String args");
		return 2;
	}

	static String print(int s, int t, String r) {
		System.out.println("This is print method with String args");
		return "A";
	}

	public static void main(String[] args) {
		mo.print("D");

	}

}
