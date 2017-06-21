package com.unnatisoft.clone;

public class Person implements Cloneable {
	int id;
	String age;
	Address address;

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person();
		Address a1 = new Address();
		p1.address = a1;
		//Person p2 = p1;
		Person p2 = (Person) p1.clone();
		if (p1.equals(p2)) {
			System.out.println("Objects are equal");
		}

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.address.hashCode());
		System.out.println(p2.address.hashCode());

	}
}