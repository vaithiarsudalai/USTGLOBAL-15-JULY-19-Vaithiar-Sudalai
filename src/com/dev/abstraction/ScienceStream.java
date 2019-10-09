package com.dev.abstraction;

public abstract class ScienceStream {

	public ScienceStream() {
		System.out.println("Science Stream");
	}

	abstract void attemptJee();

	abstract void attemptCet();

	public void show() {
		System.out.println("Exams to clear");
	}

}
