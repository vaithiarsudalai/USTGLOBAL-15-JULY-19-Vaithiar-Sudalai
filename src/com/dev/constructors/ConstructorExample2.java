package com.dev.constructors;

public class ConstructorExample2 {
	public ConstructorExample2(float f) {
		System.out.println("The const is with int args");  
	}

	public ConstructorExample2() {
		System.out.println("This is no-arg constructor");  
	}

	public ConstructorExample2(String s) {
		System.out.println("This const is with String arg");  
	}

	public ConstructorExample2(String s, int i) {
		System.out.println("This const is with String and int arg");  
	}

	public ConstructorExample2(int i, String s) {
		System.out.println("This const is with int and String arg");  
	}

	public ConstructorExample2(int i, String s, char c) {
		System.out.println("This const is with int, String and char arg");  
	}

	public ConstructorExample2(int i, char c, String s) {
		System.out.println("This const is with int, char and String arg");  
	}

	public ConstructorExample2(int i, char c, boolean h) {
		System.out.println("This const is with int, char and boolean arg");  
	}

	public static void main(String[] args) {
		ConstructorExample2 ce = new ConstructorExample2();
		System.out.println(ce);

		ConstructorExample2 ce1 = new ConstructorExample2(5.6f);
		System.out.println(ce1);

		ConstructorExample2 ce2 = new ConstructorExample2("s");
		System.out.println(ce2);

		ConstructorExample2 ce3 = new ConstructorExample2("S", 4);
		System.out.println(ce3);

		ConstructorExample2 ce4 = new ConstructorExample2(4, "D");
		System.out.println(ce4);

		ConstructorExample2 ce5 = new ConstructorExample2(4, "F", 's');
		System.out.println(ce5);

		ConstructorExample2 ce6 = new ConstructorExample2(4, 's', "R");
		System.out.println(ce6);

		ConstructorExample2 ce7 = new ConstructorExample2(9, 'x', true);
		System.out.println(ce7);
	}

}
