package com.unnatisoft.oops.inheritance;

public class StaticDemo {

	//Static Block
		static{
			System.out.println("Static Block is executed");
		}
		
	static int i = 100;
	int j = 20;
	
	
	public static void main(String[] args) {
		StaticDemo sd1 = new StaticDemo();
		sd1.m1();
		StaticDemo sd2 = new StaticDemo();
	}

	public void m1(){
		m2();
		System.out.println("non-static method");
	}
	
	public static void m2(){
		System.out.println("Static method");
	}
}
