package com.unnatisoft.oops.protecteddemo;

import com.unnatisoft.oops.inheritance.SuperClass;

public class AModifierDemo {
	SuperClass sobj = new SuperClass();
	void method3() {
		// System.out.println(aPrivate); // Not visible
		System.out.println(sobj.aPublic);
		//System.out.println(aProtected);
		//System.out.println(sobj.aDefault); // Not visible
	}
}
