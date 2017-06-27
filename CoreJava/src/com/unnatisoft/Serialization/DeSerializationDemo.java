package com.unnatisoft.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import com.unnatisoft.clone.Person;

public class DeSerializationDemo implements Serializable {

	public static void main(String[] args) {
		ClassThree clazz3 = new ClassThree();
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("MyObjectData.abc")));
			try {
				ClassThree p1 = (ClassThree)ois.readObject();
				System.out.println(p1);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}