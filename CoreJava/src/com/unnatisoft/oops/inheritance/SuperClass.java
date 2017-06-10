package com.unnatisoft.oops.inheritance;

public class SuperClass {
	private String aPrivate = "Str1";
	public String aPublic = "Str2";
	protected String aProtected = "Str3";
	String aDefault = "Str4";

	public SuperClass(){
		//
		//
		//
		//
		//
		
	}
	
	SuperClass(String aPrivate){
		aPrivate = "Str1";
	}

	public void method1() {
		System.out.println("method 1");
		method2();
	}

	public void method2() {
		
	}
}
