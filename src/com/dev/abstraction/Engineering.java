package com.dev.abstraction;

public abstract class Engineering extends ScienceStream {
	
	public Engineering() {
		System.out.println("Engineering Stream");
	}
	
	@Override
	public void attemptJee() {
		System.out.println("You have to clear");
	}
	
	abstract void project();

}
