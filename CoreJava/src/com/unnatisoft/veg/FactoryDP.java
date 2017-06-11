package com.unnatisoft.veg;

public class FactoryDP {

	public static Vegetable giveMeObject(String veg){
		Vegetable vObj = null;
		switch (veg) {
		case "Tamato":
			vObj = new Tamato();
			break;
		case "Potato":
			vObj = new Potato();
			break;
		case "Brinjal":
			vObj = new Brinjal();
			break;

		default:
			vObj = new Tamato();
			break;
		}
		return vObj;
	}
}
