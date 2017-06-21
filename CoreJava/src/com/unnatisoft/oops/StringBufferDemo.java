package com.unnatisoft.oops;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("World");
		String s3 = "Hello" + "World";
		System.out.println(s3);
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.append("World");
		System.out.println(sb1);

		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		// System.out.println(sb2.charAt(2)); //
		// StringIndexOutOfBoundsException: String index out of range: 2
		
		//StringBuilder
	}

}
