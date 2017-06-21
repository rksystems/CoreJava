package com.unnatisoft.clone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {

	public static void main(String[] args) {
		Person p1 = new Person();
		Address a1 = new Address();
		a1.street = "Street One";
		a1.pin = "161139";
		p1.id = 1;
		p1.age = 21;
		p1.address = a1;

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("MyObjectData.abc")));
			oos.writeObject(p1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}