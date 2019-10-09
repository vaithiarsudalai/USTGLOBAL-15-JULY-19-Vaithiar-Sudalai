package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SyncMainThread started......");

		Printer p = new Printer();
		
		Printer1 p1 = new Printer1();

//		new Thread4(p).start();
		new Thread5(p).start();
		
		Thread4 t4 = new Thread4(p);
		t4.start();
		t4.join();
		
		new Thread6(p1).start();
		new Thread7(p1).start();
		

		for (int i = 1; i <= 10; i++) {
			System.out.println("i : "+i);
		}

		System.out.println("SyncMainThread terminated......");
	}

}
