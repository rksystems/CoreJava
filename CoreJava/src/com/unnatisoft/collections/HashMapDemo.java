package com.unnatisoft.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.unnatisoft.threads.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "20");
		Student s2 = new Student(2, "20");
		Student s3 = new Student(3, "20");
		Student s4 = new Student(4, "20");
		
		Student s5 = new Student(5, "20");
		Student s6 = new Student(6, "20");
		Student s7 = new Student(7, "20");
		Student s8 = new Student(8, "20");
		
		Student s9 = null;
		Student s10 = null;
		
		HashMap<Student, Student> hMap = new HashMap<>();
		hMap.put(s1, s2);
		hMap.put(s3, s4);
		hMap.put(s5, s6);
		hMap.put(s7, s8);
		hMap.put(s9, s10);
		
		//System.out.println(hMap);
		Set<Student> kset = hMap.keySet();
		for(Student student : kset)
			System.out.println(hMap.get(student));
			
		Set<Entry<Student,Student>> eset = hMap.entrySet();
		for(Entry<Student,Student> entry : eset)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}

