package com.unnatisoft.threads.producerconsumer;

public class Test {

	public static void main(String[] args) {
		MessageBox mb = new MessageBox(null);
		Producer p = new Producer(mb);
		Consumer c = new Consumer(mb);
		
		new Thread(p).start();
		new Thread(c).start();
	}

}