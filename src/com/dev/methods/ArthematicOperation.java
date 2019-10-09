package com.dev.methods;

public class ArthematicOperation {

	static ArthematicOperation ao = new ArthematicOperation();

	public int add(int i, int j) {
		int value = i + j;
		System.out.println("Addition with two arg ");
		return value;
	}

	public int add(int i, int j, int k) {
		int value = i + j + k;
		System.out.println("Addition with three arg");
		return value;
	}

	public int add(int i, int j, int k, int l) {
		int value = i + j + k + l;
		System.out.println("Addition with four arg");
		return value;
	}

	public int subtract(int i, int j) {
		int value = i - j;
		System.out.println("Subtraction with two arg");
		return value;
	}

	public int subtract(int i, int j, int k) {
		int value = i - j - k;
		System.out.println("Subtraction with three arg");
		return value;
	}

	public int subtract(int i, int j, int k, int l) {
		int value = i - j - k -l;
		System.out.println("Subtraction with four arg");
		return value;
	}

	public int multiply(int i, int j) {
		int value = i * j;
		System.out.println("Multiplication with two arg");
		return value;
	}

	public int multiply(int i, int j, int k) {
		int value = i * j * k;
		System.out.println("Multiplication with three arg");
		return value;
	}

	public int multiply(int i, int j, int k, int l) {
		int value = i * j * k * l;
		System.out.println("Multiplication with four arg");
		return value;
	}

	public double divide(double i, double j) {
		double value = i / j;
		System.out.println("Dividing with two arg");
		return value;
	}

	public double divide(double i, double j, double k) {
		double value = ( i / j ) / k;
		System.out.println("Dividing with three arg");
		return value;
	}

	public double divide(double i, double j, double k, double l) {
		double value = ( i / j ) / ( k / l );
		System.out.println("Dividing with four arg");
		return value;
	}

	public static void main(String[] args) {

		int a = ao.add(4, 2);
		System.out.println("Value : "+a);

		int s = ao.subtract(50, 10, 12);
		System.out.println("Value : "+s);

		int m = ao.multiply(12, 3, 5, 9);
		System.out.println("Value : "+m);

		double d = ao.divide(50, 2, 3);
		System.out.println("Value : "+d);

	}

}
