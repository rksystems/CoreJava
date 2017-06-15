package com.unnatisoft.threads.sync;

public class SynchMethod {
	public void printString() {
		String tName = Thread.currentThread().getName();
		System.out.print("[Apple"+tName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]"+tName);
	}
	
	public void m2() {
		System.out.print("[Apple");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		SynchMethod sm = new SynchMethod();
		sm.printString();
	}
}