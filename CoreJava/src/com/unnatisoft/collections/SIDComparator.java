/**
 * 
 */
package com.unnatisoft.collections;

import java.util.Comparator;

import com.unnatisoft.threads.Student;

/**
 * @author Raghu Kishore
 *
 */
public class SIDComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId() - o2.getId();
	}
}
