package com.ustglobal.usttyspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.usttyspringcore.beans.Animal;
import com.ustglobal.usttyspringcore.beans.HelloWorld;
import com.ustglobal.usttyspringcore.beans.Pet;

public class App {
	public static void main(String[] args) {
		HelloWorld object1 = new HelloWorld();
		object1.setMessage("Hello World !!!!!!!!!");
		System.out.println(object1.getMessage());

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld object = context.getBean(HelloWorld.class);
		System.out.println(object.getMessage());
		System.out.println(object.getCount());
		object.getAnimal().makeSound();
		System.out.println(object.getMap());
		
		System.out.println("****************************************");

//		Animal animal = (Animal)context.getBean("human");
//		animal.makeSound();
		
		System.out.println("****************************************");
		
//		Animal animal1 = (Animal)context.getBean("dog");
//		animal1.makeSound();
		context.close();
		System.out.println("****************************************");
		
//		Pet pet = context.getBean(Pet.class);
//		System.out.println(pet.getName());
//		pet.getAnimal().makeSound();
		
		
	}
}
