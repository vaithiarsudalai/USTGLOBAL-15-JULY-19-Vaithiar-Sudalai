package com.dev.inheritance;

public class ChildClass extends ParentClass {
	static ChildClass cc = new ChildClass();

	@Override
	public void name() {
		System.out.println("Subclass Print Statement");
		super.name();
	}

	@Override
	public void name1() {                                      // Cannot override private method
		System.out.println("Subclass Print Statement");
		super.name1();                                         // Cannot inherit private method
	}

	@Override
	public void name3 () {                                      // Cannot override a final method
		System.out.println("Subclass Print Statement");
		super.name3();                                          //  Can inherit final method
	}

	@Override
	public void name5() {                                       // Cannot Override static method 
		System.out.println("Subclass Print Statement");
		super.name5();                                          // Cannot inherit static method
	}

	public static void main(String[] args) {
		cc.name();
		cc.name1();
		cc.name5();
		cc.name3();

	}

}
