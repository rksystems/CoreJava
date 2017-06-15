package com.unnatisoft.veg;

public class StringEquals {

	public static void main(String[] args) {

		String s1 = "Hello"; // String is created in pool
		String s2 = "Hello"; // Points to the same string created in above statement

		String s3 = new String("Hello"); // Creates new string
		String s4 = new String("Hello"); // Creates new string

		if (s1 == s2) // == operator 'checks' whether references are pointing to same Object  
			System.out.println("s1, s2 Eq");
		else
			System.out.println("s1, s2 ne");

		if (s3 == s4)
			System.out.println("s3, s4 Eq");
		else
			System.out.println("s3, s4 ne");
		//***************************************************/
		String email = new String("infohr@gmail.com");
		System.out.println(email.indexOf('@'));
		System.out.println(email.indexOf("gmail"));
		System.out.println(email.lastIndexOf(".com"));
		System.out.println(email.substring(0, email.indexOf('@')));
		System.out.println(email.charAt(6));
		
		String gr = new String("Hello ");
		String na = new String("Rama");
		String cat = new String(gr+na);
		System.out.println(cat);
		
	}

}
