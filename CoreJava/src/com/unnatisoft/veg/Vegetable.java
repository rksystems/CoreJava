package com.unnatisoft.veg;

public class Vegetable {
	public double getPrice() {

		return 0.0;
	}

	//
	public static void main(String ars[])
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		/*Class cls = Class.forName(ars[0]);
		System.out.println("1");
		Class sdf = Class.forName(ars[0]);
		System.out.println("2");
		Object obj = cls.newInstance();*/
		
		//Vegetable v = null;
		Vegetable v = FactoryDP.giveMeObject(ars[0]);
		/*if (obj instanceof Tamato) {
			v = (Tamato) obj;
		}
		if (obj instanceof Potato) {
			v = (Potato) obj;
		}
		if (obj instanceof Brinjal) {
			v = (Brinjal) obj;
		}*/
		
		System.out.println(v.getPrice());
	}
}
