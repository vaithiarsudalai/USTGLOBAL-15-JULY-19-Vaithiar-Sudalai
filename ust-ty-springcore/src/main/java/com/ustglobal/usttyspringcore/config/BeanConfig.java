package com.ustglobal.usttyspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.usttyspringcore.beans.Dog;
import com.ustglobal.usttyspringcore.beans.HelloWorld;
import com.ustglobal.usttyspringcore.beans.Human;

@Configuration
public class BeanConfig {

	@Bean(name = "object")                         //autowire = Autowire.BY_TYPE
	public HelloWorld getHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World !!!!");
		helloWorld.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 789);
		helloWorld.setMap(map);
//		helloWorld.setAnimal(getDog());
		return helloWorld;
	}

	@Bean(name = "dog")
//	@Scope("prototype")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "human")
	public Human getHuman() {
		return new Human();
	}
}
