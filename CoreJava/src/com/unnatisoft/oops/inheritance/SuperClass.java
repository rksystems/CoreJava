package com.unnatisoft.oops.inheritance;

public abstract class SuperClass {
	private String aPrivate;
	public String aPublic;
	protected String aProtected;
	String aDefault;

	public SuperClass(){
		aPrivate = "Str1";
		aPublic = "Str2";
		aProtected = "Str3";
		aDefault = "Str4";
	}
	
	
	
	public SuperClass(String aPrivate, String aPublic, String aProtected, String aDefault) {
		super();
		this.aPrivate = aPrivate;
		this.aPublic = aPublic;
		this.aProtected = aProtected;
		this.aDefault = aDefault;
	}



	SuperClass(String aPrivate){
		aPrivate = "Str1";
	}

	final public void method1() {
		System.out.println("method 1");
		method2();
	}

	public abstract void method2();
}
