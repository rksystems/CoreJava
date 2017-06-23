package com.unnatisoft.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.unnatisoft.veg.Brinjal;
import com.unnatisoft.veg.Potato;
import com.unnatisoft.veg.Tamato;
import com.unnatisoft.veg.Vegetable;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> lList = new LinkedList<>();
		lList.add("1");
		lList.add("2");
		lList.add("3");

		lList.add("4");
		lList.add("5");
		lList.add("6");
		
		lList.add(3, "100");

		// System.out.println(lList);

		ListIterator<String> iter = lList.listIterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
			/*if ("4".equals(string))
				break;*/
		}
		System.out.println("*********");
		while (iter.hasPrevious()) {
			String string = (String) iter.previous();
			System.out.println(string);
		}

		// Enhanced for loop
		/*
		 * for(String tempStr : lList){ System.out.print(tempStr);
		 * System.out.print(" "); }
		 */
		// for(initialization;condition;incrment/decrement){}

		/*
		 * List<Integer> numbers = new LinkedList<>(); numbers.add(1); // Auto
		 * Boxing numbers.add(new Integer(2)); numbers.add(new Integer("3"));
		 * numbers.add(Integer.valueOf(4));
		 */

		/*
		 * List<Vegetable> veg = new LinkedList<>(); veg.add(new Tamato());
		 * veg.add(new Potato()); veg.add(new Brinjal()); veg.add(new Tamato());
		 * veg.add(new Potato()); veg.add(new Brinjal());
		 */

	}

}
