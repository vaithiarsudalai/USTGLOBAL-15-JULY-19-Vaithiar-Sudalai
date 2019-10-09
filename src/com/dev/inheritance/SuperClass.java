package com.dev.inheritance;

public class SuperClass {
	
	public SuperClass() {
		System.out.println("Const with no-args in SuperClass");
	}
	
	public SuperClass(int i) {
		System.out.println("Const with int args in SuperClass");
	}
	
	public SuperClass(String s) {
		System.out.println("Const with string args in SuperClass");
	}
	
	public SuperClass(String s, int i) {
		System.out.println("Const with string and int args in SuperClass");
	}
	
	public SuperClass(int i, String s) {
		System.out.println("Const with int and string args in SuperClass");
	}

	public static void main(String[] args) {
		

	}

}
