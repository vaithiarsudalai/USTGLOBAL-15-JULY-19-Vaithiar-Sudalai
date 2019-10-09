package com.dev.constructors;

public class ConstructorExample {
	public  ConstructorExample(int i) {
		System.out.println("The const is with int args");  //Parameterized
	}

	public ConstructorExample() {
		System.out.println("This is no-arg constructor");  //No argument
	}
	
	public ConstructorExample(String s) {
		System.out.println("This const is with String arg");  
	}
	
	public ConstructorExample(String s, int i) {
		System.out.println("This const is with String and int arg");  
	}
	
	public ConstructorExample(int i, String s) {
		System.out.println("This const is with int and String arg");  
	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(1);
		ConstructorExample ce2 = new ConstructorExample("A");
		ConstructorExample ce3 = new ConstructorExample("A", 3);
		ConstructorExample ce4 = new ConstructorExample(5, "A");
	}

}
