package com.unnatisoft.oops.inheritance;

public class SubClassInSamePackage extends SuperClass {

	public SubClassInSamePackage() {
		super("");
	}

	SubClassInSamePackage(String str) {
		super();
		//
		//
		//
	}


	

	public void method2() {
		super.aDefault="sdfsd";
		System.out.println("Method in Child");
	}

	void method3() {
		// System.out.println(aPrivate); // Not visible
		System.out.println(aPublic);
		System.out.println(aProtected);
		System.out.println(aDefault);
	}
}
