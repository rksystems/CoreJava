package com.unnatisoft.collections;

import java.util.HashSet;
import java.util.Set;

import com.unnatisoft.threads.Student;

public class HashSetDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "20");
		Student s2 = new Student(1, "20");
		Student s3 = new Student(3, "20");
		Student s4 = new Student(4, "20");
		
		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for(Student st : set)
			System.out.println(st.getId());
	}

}
