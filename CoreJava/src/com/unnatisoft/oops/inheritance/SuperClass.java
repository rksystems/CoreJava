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
		System.out.println(aPrivate);
		System.out.println(aPublic);
		System.out.println(aProtected);
		System.out.println(aDefault);
		
	}

	public void method2() {
		System.out.println("Method 2");
	}
}
