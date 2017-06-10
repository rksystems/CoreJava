package com.unnatisoft.oops.inheritance;

public class SubClassInSamePackage extends SuperClass {

	public SubClassInSamePackage(){
		super("");
	}
	
	SubClassInSamePackage(String str){
		super();
		//
		//
		//
	}
	
	SuperClass sobj = new SuperClass();
	
	
	public void method1() {
		System.out.println("method 1 in Child");
		method2();
	}
	
	
	
	void method3(){
		//System.out.println(aPrivate); // Not visible
		System.out.println(aPublic);
		System.out.println(aProtected);
		System.out.println(aDefault);
	}
}
