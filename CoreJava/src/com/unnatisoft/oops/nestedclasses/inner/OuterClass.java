package com.unnatisoft.oops.nestedclasses.inner;

public class OuterClass {
	String outerName;
	int age;

	static class StaticNestedClass {
		String nestedName;
		int age;
	}

	class InnerClass {
		String innerName;
		int age;
	}

	public static void main(String... args) {
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj = outerObj.new InnerClass();
	}
}
