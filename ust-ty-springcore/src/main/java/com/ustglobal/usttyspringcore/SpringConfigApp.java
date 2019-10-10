package com.ustglobal.usttyspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.usttyspringcore.beans.HelloWorld;
import com.ustglobal.usttyspringcore.config.SpringConfig;

public class SpringConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.getAnimal().makeSound();

	}

}
