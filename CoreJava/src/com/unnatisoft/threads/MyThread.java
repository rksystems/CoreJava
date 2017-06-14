package com.unnatisoft.threads;

public class MyThread extends Thread {

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
	
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		//Runnable r = () -> System.out.println("");

	}

}
