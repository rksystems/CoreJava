package com.unnatisoft.threads;

public class DaemonThreadTest {
	public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(), "dt");
        dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(5000);
        System.out.println("Finishing program");
    }
}