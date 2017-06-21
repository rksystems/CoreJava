package com.unnatisoft.clone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationDemo implements Serializable {

	public static void main(String[] args) {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("MyObjectData.abc")));
			try {
				Person p1 = (Person)ois.readObject();
				System.out.println(p1);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}