package com.unnatisoft.exceptionhandling;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
	Map<String, String> phoneDirectory = new HashMap<>();

	public PhoneDirectory() {
		super();
		phoneDirectory.put("Rama", "123456");
		phoneDirectory.put("Ravi", "543523");
		phoneDirectory.put("Bhaskar", "546555");
		phoneDirectory.put("Hari", "546564");
		phoneDirectory.put("Narayan", "456+65");
	}

	public String findName(String name) throws CustomException {
		String phno = null;
		if(phoneDirectory.containsKey(name))
			phno = phoneDirectory.get(name);
		else {
			throw new CustomException("Name not exist in ph dir");
		}
		return phno;
	}
}
