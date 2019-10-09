package com.dev.threads;

public class Printer1 {

	public synchronized void printVal(int i, String thread) {
		for (int k = 0; k <= i; k++) {
			System.out.println("Thread name : "+thread+" "+" k = "+k);
		}
	}
}
