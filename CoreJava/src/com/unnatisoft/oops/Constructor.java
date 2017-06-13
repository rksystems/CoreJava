package com.unnatisoft.oops;

public class Constructor extends Object{

	// Default Constructor
	public Constructor() {
		super();
		System.out.println("Object created");
	}
	
	// Perameterized Constructor
		public Constructor(int i) {
			System.out.println("Object created");
		}
		
		@Override
		protected void finalize(){
			System.out.println("Object is being destroyed");
		}
		
		

}
