package com.unnatisoft.threads.producerconsumer;

public class Consumer implements Runnable {

	MessageBox mb = null;

	public Consumer(MessageBox mb) {
		this.mb = mb;
	}

	@Override
	public void run() {
		synchronized (mb) {
			try {
				mb.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.mb.getBox());
			//this.mb.setBox(null);
		}
	}

}
