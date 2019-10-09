package com.dev.abstraction;

public class Medical extends ScienceStream {

	public Medical() {
		System.out.println("Medical Stream");
	}

	@Override
	public void attemptJee() {
		System.out.println("Clear JEE");
	}

	@Override
	public void attemptCet() {
		System.out.println("Clear CET");
	}

	public static void main(String []args) {
		Medical m = new Medical();

		m.attemptCet();
		m.attemptJee();

	}

}
