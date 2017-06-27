package com.unnatisoft.clone;

import java.io.Serializable;

public class Person implements Cloneable, Serializable {
	public int id;
	public int age;
	public Address address;
	private static final long serialVersionUID = 1L;
	
	public Person() {
		System.out.println("Const");
		this.id = 12;
		this.age = 21;
		// this.address = new Address();
	}

	protected Object clone() throws CloneNotSupportedException {
		Person pCloned = new Person();
		Address aa = new Address();
		aa.street = this.address.street;
		aa.pin = this.address.pin;
		pCloned.id = this.id;
		pCloned.age = this.age;
		pCloned.address = aa;

		return pCloned;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person();
		// Address a1 = new Address();
		// p1.address = a1;
		// Person p2 = p1;

		// p1.id = 14;

		Person p2 = (Person) p1.clone();
		p1.address.pin = "566";
		if (p1.equals(p2)) {
			System.out.println("Objects are equal");
		}

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.address.hashCode());
		System.out.println(p2.address.hashCode());

		System.out.println(p1);
		System.out.println(p2);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", address=" + this.address + "]";
	}

}