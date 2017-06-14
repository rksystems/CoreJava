package com.unnatisoft.threads;

public class RunnableThread implements Runnable{

	Student st = null;

	public RunnableThread(Student std) {
		this.st = std;
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		String temp[] = null;
		if (this.st.getCourses() != null) {
			String actual[] = this.st.getCourses();
			temp = new String[actual.length + 1];
			int i = 0;
			for (; i < actual.length; i++)
				temp[i] = actual[i];
			temp[i] = "Course set by " + tName;
			this.st.setCourses(temp);
			for (String s : this.st.getCourses())
				System.out.println(s);
		} else {
			temp = new String[1];
			temp[0] = "First Course";
			this.st.setCourses(temp);
		}
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.setId(1);
		std.setName("Rama");
		String temp[] = new String[1];
		temp[0] = "Java";
		std.setCourses(temp);
		Runnable r1 = new RunnableThread(std);
		Runnable r2 = new RunnableThread(std);

		new Thread(r1).start();
		new Thread(r2).start();

	}

}