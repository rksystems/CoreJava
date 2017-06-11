package com.unnatisoft.oops;

import com.unnatisoft.oops.inheritance.SubClassInSamePackage;
import com.unnatisoft.oops.inheritance.SuperClass;

public class Test {
	
	final static int legs=4;
	
	public static void main(String ars[]){
		
		SingleTon sss = SingleTon.getSingleTon();
		
		System.out.println(sss);
		SubClassInSamePackage subObj = new SubClassInSamePackage();
		
		//SuperClass superRef = new SubClassInSamePackage();
		//superRef.method3();
		//superRef.method1(); // ---(1)
		
		// When (1) is compiled, java compiler checks whether 
		// method1() is available in SuperClass or not
		
		// At run time the method1() is checked first
		//in Child Object,
		//If it is presented then executed, otherwise 
		//JVM check in immediate 
		//parent
		
	}
}
