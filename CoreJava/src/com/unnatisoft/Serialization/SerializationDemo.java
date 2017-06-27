package com.unnatisoft.Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.unnatisoft.clone.Address;
import com.unnatisoft.clone.Person;

public class SerializationDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		Address a1 = new Address();
		a1.street = "Street One";
		a1.pin = "161139";
		p1.id = 1;
		p1.age = 21;
		p1.address = a1;
		ClassTwo clazz3 = new ClassTwo(1);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(new File("MyObjectData.abc")));
			oos.writeObject(clazz3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}