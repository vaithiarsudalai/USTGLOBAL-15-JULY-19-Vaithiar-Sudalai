package com.dev.abstraction;

public class Interface1 implements InterfaceExample {

	public static void main(String[] args) {
		InterfaceExample.show();
		Interface1 i = new Interface1();
		i.display();
		i.print();

	}

	@Override
	public void display() {
		System.out.println("Display method in Interface1");
		
	}

}
