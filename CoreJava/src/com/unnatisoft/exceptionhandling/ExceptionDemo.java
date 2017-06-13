package com.unnatisoft.exceptionhandling;

public class ExceptionDemo {

	void method1() {
		m2();
	}

	void m2() {
		method1();
	}

	public static void main(String[] args) {
		new ExceptionDemo().m2();
	}

}
