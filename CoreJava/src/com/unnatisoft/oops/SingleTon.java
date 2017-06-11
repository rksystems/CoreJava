package com.unnatisoft.oops;

public class SingleTon {

	private SingleTon() {

	}

	private static SingleTon singleTon = new SingleTon();

	public static SingleTon getSingleTon() {
		return singleTon;
	}
	
}
