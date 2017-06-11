package com.unnatisoft.veg;

public class Tamato extends Vegetable {
	
	//Static Block
	static{
		System.out.println("Static Block is executed");
	}
	
	public double m1() {
		return 20.0;
	}
	
	public Tamato() {
		super();
		System.out.println("Constructer is executed");
	}


	public double getPrice() {
		return 20.0;
	}
}
