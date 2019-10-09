package com.dev.polymorphism;

public class RunTimeBase {
	static RunTimeBase r = new RunTimeBase();
	
	public void add(int i) {
		int value = i + i;
		System.out.println("Value : "+value);
		System.out.println("Base");
	}

	public static void main(String[] args) {
		r.add(3);
	}

}
