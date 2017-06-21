package com.unnatisoft.clone;

import java.io.Serializable;

public class Person implements Cloneable, Serializable {
	int id;
	int age;
	Address address;

	Person() {
		super();
		this.id = 12;
		this.age = 21;
		this.address = new Address();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person();
		Address a1 = new Address();
		p1.address = a1;
		// Person p2 = p1;
		Person p2 = (Person) p1.clone();
		if (p1.equals(p2)) {
			System.out.println("Objects are equal");
		}

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.address.hashCode());
		System.out.println(p2.address.hashCode());

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", address=" + address + "]";
	}

}