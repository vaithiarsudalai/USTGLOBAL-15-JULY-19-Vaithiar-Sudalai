package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main Thread started...");

		System.out.println("MainThreadClass is printing the value for i");

		Thread2 t2 = new Thread2();
		t2.start();
		t2.setName("Thread T2");
		//		new T2().start();
		t2.setPriority(4);

		Thread.currentThread().setName("Main Thread");

		Thread3 t3 = new Thread3();
		Thread th = new Thread(t3);
		th.start();
		//		new Thread(new T3()).start();
		th.setPriority(1);

		for (int i = 1; i <= 10; i++) {
			System.out.println("i : "+i);
		}

		System.out.println("Thread Name2: "+t2.getName());
		System.out.println("Thread Name1: "+Thread.currentThread().getName());
		
		System.out.println("Thread2 id: "+t2.getId());
		System.out.println("Thread3 id: "+th.getId());
		System.out.println("Thread1 id: "+Thread.currentThread().getId());
		
		System.out.println("Thread2 priority: "+t2.getPriority());
		System.out.println("Thread3 priority: "+th.getPriority());
		
		System.out.println("Main thread terminated...");
	}
}
