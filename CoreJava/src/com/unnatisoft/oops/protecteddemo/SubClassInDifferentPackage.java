package com.unnatisoft.oops.protecteddemo;

import com.unnatisoft.oops.inheritance.SuperClass;

public class SubClassInDifferentPackage extends SuperClass {
	SuperClass sss = new SuperClass();
	void method3() {
		// System.out.println(aPrivate); // Not visible
		System.out.println(sss.aPublic);
		System.out.println(aProtected);
		//System.out.println(sobj.aDefault); // Not visible
	}
}
