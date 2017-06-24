package com.unnatisoft.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.unnatisoft.threads.Student;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Student, Student> treeMap = new TreeMap<>();

		Student s1 = new Student(1, "20");
		Student s2 = new Student(2, "20");
		Student s3 = new Student(3, "20");
		Student s4 = new Student(4, "20");
		
		Student s5 = new Student(5, "20");
		Student s6 = new Student(6, "20");
		Student s7 = new Student(7, "20");
		Student s8 = new Student(8, "20");
		
		Student s9 = new Student(9, "20");
		Student s10 = null;
		treeMap.put(s7, s2);
		treeMap.put(s9, s10);
		treeMap.put(s1, s8);
		treeMap.put(s3, s4);
		treeMap.put(s5, s6);
		
		
		//System.out.println(treeMap);
		Set<Student> kset = treeMap.keySet();
		for(Student student : kset)
			System.out.println(treeMap.get(student));
			
		Set<Entry<Student,Student>> eset = treeMap.entrySet();
		for(Entry<Student,Student> entry : eset)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
