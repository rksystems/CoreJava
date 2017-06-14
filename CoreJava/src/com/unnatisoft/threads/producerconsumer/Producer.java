package com.unnatisoft.threads.producerconsumer;

public class Producer implements Runnable {

	MessageBox mb = null;

	public Producer(MessageBox mb) {
		this.mb = mb;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (mb) {
			this.mb.setBox("Hello");
			mb.notify();
		}

	}

}