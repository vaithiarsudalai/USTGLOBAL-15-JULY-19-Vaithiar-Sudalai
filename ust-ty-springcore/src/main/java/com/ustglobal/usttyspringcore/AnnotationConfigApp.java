package com.ustglobal.usttyspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.usttyspringcore.beans.Animal;
import com.ustglobal.usttyspringcore.beans.HelloWorld;
import com.ustglobal.usttyspringcore.config.BeanConfig;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloWorld object = context.getBean(HelloWorld.class);
		System.out.println(object.getMessage());
		System.out.println(object.getCount());
		System.out.println(object.getMap());
		object.getAnimal().makeSound();
		
		Animal animal1 = (Animal) context.getBean("dog");
		Animal animal2 = (Animal) context.getBean("dog");
		System.out.println(animal1==animal2);
		
		context.close();
		
		
	}
}
