package com.dev.inheritance;

public class SubClass extends SuperClass {

	public SubClass() {
		super();
	}
	
	public SubClass(int i) {
		super(4);
	}
	
	public SubClass(String s) {
		super("S");
	}
	
	public SubClass(String s, int i) {
		super("S", 2);
	}
	
	public SubClass(int i, String s) {
		super(4, "C");
	}
	
//	public  SubClass() {
//		System.out.println("Const with no-arg in SubClass");
//	}
	
//	public SubClass(int i) {
//		System.out.println("Const with int arg in SubClass");
//	}
	
//	public SubClass(String s) {
//		System.out.println("Const with String arg in SubClass");
//	}
	
//	public SubClass(String s, int i) {
//		System.out.println("Const with String and int arg in SubClass");
//	}
	
//	public SubClass(int i, String s) {
//		System.out.println("Const with String and int arg in SubClass");
//	}

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		SubClass sc1 = new SubClass(7);
		SubClass sc2 = new SubClass("S", 7);
		SubClass sc3 = new SubClass(9, "S");
		SubClass sc4 = new SubClass("S");
	}

}
