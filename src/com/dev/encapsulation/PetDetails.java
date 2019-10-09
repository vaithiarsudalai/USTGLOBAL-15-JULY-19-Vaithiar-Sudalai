package com.dev.encapsulation;

public class PetDetails {

	public static void main(String[] args) {
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();
		Pets p4 = new Pets();
		
		p1.setPet("Dog");
		p1.setName("Jack");
		p1.setAge(3);
		p1.setColor("White");
		
		p2.setPet("Rabbit");
		p2.setName("Buggs");
		p2.setAge(2);
		p2.setColor("Grey & White");
		
		p3.setPet("Cat");
		p3.setName("Silvaster");
		p3.setAge(2);
		p3.setColor("Black & White");
		
		p4.setPet("Bird");
		p4.setName("Tweety");
		p4.setAge(1);
		p4.setColor("Yellow");
		
		Pets [] pe = {p1,p2,p3,p4};
		
		for(int i = 0; i < pe.length; i++) {
			System.out.println("Pet type : "+pe[i].getPet());
			System.out.println("Name : "+pe[i].getName());
			System.out.println("Age : "+pe[i].getAge());
			System.out.println("Color : "+pe[i].getColor());
			System.out.println("***************************************");
		}
		
	}

}
