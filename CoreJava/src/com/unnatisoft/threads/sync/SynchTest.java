package com.unnatisoft.threads.sync;

public class SynchTest extends Thread {

	SynchMethod sm = null;
	
	public SynchTest(SynchMethod sm) {
		super();
		this.sm = sm;
	}

	@Override
	public void run() {
		//
		//
		synchronized (sm) {
			//
			sm.printString();
			//
		}
		//
		//
	}
	
	public static void main(String[] args) {
		SynchMethod sm = new SynchMethod();
		Thread t1 = new SynchTest(sm);
		t1.setName("T1");
		t1.start();
		Thread t2 = new SynchTest(sm);
		t2.setName("T2");
		t2.setPriority(9);
		t2.start();
		
		//Runnable r = () -> System.out.println("");

	}

}
