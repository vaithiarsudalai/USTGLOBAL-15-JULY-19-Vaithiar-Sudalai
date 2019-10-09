package com.dev.threads;

public class Thread6 extends Thread {

	Printer1 p1;

	public Thread6(Printer1 pref) {
		p1 = pref;
	}

	@Override
	public void run() {

		p1.printVal(10, "Thread6");
	}

}
