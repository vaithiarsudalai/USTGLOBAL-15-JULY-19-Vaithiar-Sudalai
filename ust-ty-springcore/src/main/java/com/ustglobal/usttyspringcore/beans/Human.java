package com.ustglobal.usttyspringcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Human implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Blah Blah Blah Blah............");
		
	}

}
