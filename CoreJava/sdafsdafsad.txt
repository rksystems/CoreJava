package com.unnatisoft.gc;

import com.unnatisoft.oops.Constructor;

public class GCDemo {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1 = null;
		System.gc();
	}

}
