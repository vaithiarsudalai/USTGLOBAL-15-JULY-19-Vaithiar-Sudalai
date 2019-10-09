package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Pets;

public class C1 {

	public static void main(String[] args) {
		HashSet<Pets> hs = new HashSet<Pets>();
		Pets p = new  Pets();
		p.setAge(1);
		p.setPet("Dog");
		p.setName("Jack");
		p.setColor("Black & White");
		
		Pets p1 = new  Pets();
		p1.setAge(2);
		p1.setPet("Cat");
		p1.setName("Tom");
		p1.setColor("Grey & White");
		
		Pets p2 = new  Pets();
		p2.setAge(1);
		p2.setPet("Canary");
		p2.setName("Tweety");
		p2.setColor("Yellow");
		
		p.setAge(2);
		p1.setAge(3);
		p2.setAge(3);
		
		boolean b = hs.add(p);
		boolean b1 = hs.add(p1);
		boolean b2 = hs.add(p2);
		System.out.println("Output of add() : "+b+" "+b1+" "+b2);
		
		for (Pets pet : hs) {
		System.out.println(pet);
		}
		
		System.out.println("Size of HashSet hs : "+hs.size());
		
		boolean b3 = hs.remove(p1);
		System.out.println("Output of remove() : "+b3);
		System.out.println(hs);

		System.out.println("Output of contains() : "+hs.contains(p2));
		
		System.out.println("Size of HashSet hs : "+hs.size());
		
		hs.clear();
		System.out.println("Size of HashSet hs after clear() : "+hs.size());
	}

}
