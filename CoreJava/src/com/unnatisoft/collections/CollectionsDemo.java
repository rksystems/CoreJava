package com.unnatisoft.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<>();
		Map<String, String> syncMap = (Map<String, String>) Collections.synchronizedMap(hMap);
		
	}

}
