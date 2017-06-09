package com.unnatisoft.oops.inheritance;

public class SubClassInSamePackage extends SuperClass {

	SubClassInSamePackage(){
		super("");
	}
	
	SubClassInSamePackage(String str){
		super();
		//
		//
		//
	}
	
	SuperClass sobj = new SuperClass();
	
	void method3(){
		//System.out.println(aPrivate); // Not visible
		System.out.println(aPublic);
		System.out.println(aProtected);
		System.out.println(aDefault);
	}
}
