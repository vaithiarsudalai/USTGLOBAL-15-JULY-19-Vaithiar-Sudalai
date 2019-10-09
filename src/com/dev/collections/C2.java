package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Pets;

public class C2 {

	public static void main(String[] args) {
		HashMap<String, Pets> hm = new HashMap<String, Pets>();
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
		
//		hm.put("1", p);              // First the key should be invoked or while you invoke the key for first time its show null
//		Pets d = hm.put("1", p);     // the return type of put method is object.
//		System.out.println(d);
		
		hm.put("1", p);
		hm.put("2", p1);
		hm.put("3", p2);
		
		System.out.println(hm);
		
		Pets d2 = hm.remove("2");
		System.out.println(d2);
		System.out.println(hm);
		
		System.out.println("Output of containsKey() : "+hm.containsKey("3"));
		
		System.out.println("Output of containsValue() : "+hm.containsValue(p));
		
	}

}
