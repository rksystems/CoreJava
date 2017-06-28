package com.unnatisoft.oops.nestedclasses.inner;

public class ClassOne {
	int x = 10;

	class ClassTwo {
		int x = 100;

		void m1() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(ClassOne.this.x);
		}
	}

	public static void main(String[] args) {
		new ClassOne().new ClassTwo().m1();
		

	}

}
