package com.dev.polymorphism;

public class RunTimeDerived extends RunTimeBase {
	static RunTimeDerived rt = new RunTimeDerived();

	@Override
	public void add(int i) {
		int value = i + i;
		System.out.println("Value of Adding two number : "+value);
		System.out.println("Derived");
	}
	
	public static void main(String[] args) {
		rt.add(7);
	}

}
