package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(342);
		s.setName("Viggy");
		s.setEmail("viggyvaithiar18@gmail.com");
		s.setPassword("12345");
		
		
		System.out.println("Regno : "+s.getRegno());
		System.out.println("Email : "+s.getName());
		System.out.println("Name : "+s.getEmail());
		System.out.println("************************");

	}

}
