package com.dev.threads;

public class Thread2 extends Thread {

	@Override
	public void run() {
		System.out.println("T2 thread started.... ");

		System.out.println("Thread2 is printing the value for j");

		for (int j = 1; j <= 10; j++) {
			System.out.println("j : "+j);
		}

		System.out.println("T2 thread terminated.....");
	}

}
