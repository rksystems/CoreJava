package com.unnatisoft.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		String s1 = new String("Hello");
		String s2 = null;String s3 = null;
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("7");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		//System.out.println(al);  // toString
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		al.add("7");
	}

}
