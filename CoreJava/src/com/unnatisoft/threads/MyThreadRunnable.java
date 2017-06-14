package com.unnatisoft.threads;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.print("[A");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThreadRunnable());
		Thread t2 = new Thread(new MyThreadRunnable());
		
		t1.start(); // Calls run method
		t1.join(); // Waits for this thread to die. 
		t2.start();
	}

}
