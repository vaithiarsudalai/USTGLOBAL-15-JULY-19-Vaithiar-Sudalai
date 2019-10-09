package com.dev.polymorphism;

public class CompileTimePolymorph {

	static CompileTimePolymorph ct = new CompileTimePolymorph();

	public int multiply(int i, int j) {
		int product = i * j;
		return product;
	}

	public int multiply(int i, int j, int k) {
		int product = i * j * k;
		return product;
	}

	public int multiply(int i, int j, int k, int l) {
		int product = i * j * k * l;
		return product;
	}

	public static void main(String[] args) {

		int v = ct.multiply(3, 2);
		System.out.println("Multiply with 2 args : "+v);

		int v1 = ct.multiply(3, 2, 4);
		System.out.println("Multiply with 3 args : "+v1);

		int v2 = ct.multiply(3, 2, 7, 9);
		System.out.println("Multiply with 4 args : "+v2);

	}

}
