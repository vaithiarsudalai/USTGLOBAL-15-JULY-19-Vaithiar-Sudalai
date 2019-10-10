package com.ustglobal.usttyspringcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
	
	public Dog() {
		System.out.println("Dog Object created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Dog init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Dog destroy method");
	}

	@Override
	public void makeSound() {
		System.out.println("Baooooooooooooooooooo...........");
		
	}

}
