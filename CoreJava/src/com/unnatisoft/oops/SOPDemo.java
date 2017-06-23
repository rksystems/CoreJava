package com.unnatisoft.oops;

public class SOPDemo {

	public static void main(String[] args) {
		System.out.println(true);
		System.out.println();
		System.out.println('A');
		System.out.println(1);
		System.out.println(1l);
		System.out.println(1.1f);
		System.out.println(1.1);
		System.out.println("Hello");
		System.out.println(new SOPDemo());
		SOPDemo sopd = null;
		System.out.println(sopd);
		// below method is not part of PrintStream class
		// System.out.println(null);

		System.out.print(true);
		// System.out.print(); // this method is not part of PrintStream class
		System.out.print('A');
		System.out.print(1);
		System.out.print(1l);
		System.out.print(1.1f);
		System.out.print(1.1);
		System.out.print("Hello");
		System.out.print(new SOPDemo());
		System.out.println(new SOPDemo());
	}

}
