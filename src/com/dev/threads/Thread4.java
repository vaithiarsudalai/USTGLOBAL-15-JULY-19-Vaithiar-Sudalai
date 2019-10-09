package com.dev.threads;

public class Thread4 extends Thread {

	Printer p;

	public Thread4 (Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.printVal(10, "Thread4");

		//		for (int j = 1; j <= 10; j++) {
		//			System.out.println("j : "+j);
		//		}
	}
}
