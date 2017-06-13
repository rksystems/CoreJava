package com.unnatisoft.exceptionhandling;

public class ConstructorDemo {
	static String schoolName = "smhs";

	public ConstructorDemo() {
		super();
		System.out.println("constructor executed");
	}

	public static void main(String[] args) {
		/*
		 * int i = 100; int j = 10; int k = 0; k = i / j;
		 */
		PhoneDirectory pd = new PhoneDirectory();
		try {
			System.out.println(pd.findName("Ravi1"));
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void m1(String name) throws CustomException {
		schoolName = name;

		throw new CustomException("Wrong value entered");

		// System.out.println(schoolName);
	}
}
