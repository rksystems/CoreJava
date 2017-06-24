package com.unnatisoft.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.unnatisoft.threads.Student;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		Student s1 = new Student(1, "20");
		Student s2 = new Student(2, "20");
		Student s3 = new Student(3, "20");
		Student s4 = new Student(4, "20");
		Student s5 = null;
		
		treeSet.add(s1);
		treeSet.add(s2);
		treeSet.add(s3);
		treeSet.add(s4);
		treeSet.add(s5);
		
		for(Student st : treeSet)
			System.out.println(st.getId());
	}

}
