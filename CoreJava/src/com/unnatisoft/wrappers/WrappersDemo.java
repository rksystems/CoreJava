package com.unnatisoft.wrappers;

public class WrappersDemo {

	Integer i = 0;
	String s = null;

	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer("10");
		// Integer c = new Integer("Apple"); // java.lang.NumberFormatException:
		// For input string: "Apple"

		int v1 = 10 * a.intValue();
		int v2 = 10 * b.intValue();
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		System.out.println(v1);
		System.out.println(v2);
		
		/*Integer first = new Integer(10);
		Integer second = new Integer(10);
		if(first.equals(second))
			System.out.println("first == second");
		else
			System.out.println("first != second");
		
		Integer third = new Integer(255);
		Integer fourth = new Integer(255);
		if(third.equals(fourth))
			System.out.println("third == fourth");
		else
			System.out.println("third != fourth");*/
		
		
		// Integer
		// Float
		// Byte
		// Short
		// Long
		// Double
		// Boolean
		// Character
	}

}
