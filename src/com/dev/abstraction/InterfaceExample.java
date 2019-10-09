package com.dev.abstraction;

@FunctionalInterface
public interface InterfaceExample  {
	
	void display();
	
//	void display1();
	
	public static void show() {
		System.out.println("Show method inside InterfaceExample");
	}

	default void print() {
		System.out.println("Default in Interface");
	}
	
}
