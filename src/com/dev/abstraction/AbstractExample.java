package com.dev.abstraction;

public abstract  class AbstractExample {
	
	public AbstractExample() {
		System.out.println("Const of Abstract Example");
	}
	
	abstract void display();
	
	public void show() {
		System.out.println("Concrete Mothod of Abstract class");
	}

}
