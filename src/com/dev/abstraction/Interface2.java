package com.dev.abstraction;

public class Interface2 extends AbstractExample implements InterfaceExample {

	@Override
	public void display() {
		System.out.println("Class implements an Interface");
		
	}
	
	public static void main(String []args) {
		
		Interface2 f = new Interface2();
		f.display();
	}

}
