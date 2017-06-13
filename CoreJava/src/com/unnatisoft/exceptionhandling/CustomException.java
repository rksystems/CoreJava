package com.unnatisoft.exceptionhandling;

public class CustomException extends Exception {

	
	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public String toString() {
		return "CustomException [" + super.toString() + "]";
	}

	public static void main(String[] args) {
		
	}

}
