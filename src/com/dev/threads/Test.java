package com.dev.threads;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main Thread started...");

		for (int i = 1; i <= 10000; i++) {
			System.out.println("i : "+i);
		}

		for (int j = 1; j <= 10; j++) {
			System.out.println("j : "+j);
		}

		System.out.println("Main thread terminated...");

	}

}
