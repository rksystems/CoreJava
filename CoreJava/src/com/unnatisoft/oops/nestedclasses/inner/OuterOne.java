package com.unnatisoft.oops.nestedclasses.inner;

public class OuterOne {

	class InnerOne {
		class InnerTwo {
			void m1() {
				System.out.println("Inner Two");
			}
		}
	}

	public static void main(String[] args) {
		OuterOne one = new OuterOne();
		OuterOne.InnerOne inn = one.new InnerOne();
		OuterOne.InnerOne.InnerTwo it = inn.new InnerTwo();
		it.m1();
	}

}
