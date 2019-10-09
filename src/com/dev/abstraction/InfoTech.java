package com.dev.abstraction;

public class InfoTech extends Engineering {
	
	public InfoTech() {
		System.out.println("Information Technology Department");
	}

	@Override
	public void attemptJee() {
		System.out.println("You have to clear Jee");
	}
	
	@Override
	public void attemptCet() {
		System.out.println("You have to clear Cet");
	}
	
	@Override
	public void project() {
		System.out.println("Based on Data Mining");
	}
	
	public static void main(String[] args) {
		InfoTech i = new InfoTech();
		
		i.attemptCet();
		i.attemptJee();
		i.project();

	}

}
