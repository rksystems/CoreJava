package com.unnatisoft.exceptionhandling;

public class ClassNotFoundDemo {

	void m1(String str) throws Exception {
		//1
		//2
		int i = -10;
		if(i<0)
			return;
		//3
		
	}

	public static void main(String[] args) {

		try {
			// Lock Resources
			Class.forName("com.unnatisoft.exceptionhandling.ExceptionDemo1");
			System.exit(0);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("Catch Block");
		}finally {
			// Unlock resource
			System.out.println("Finally Block");
		}
		
		// Object obj = cls.newInstance();

	}

}
