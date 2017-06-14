package com.unnatisoft.generics;

public class GenericsTypeC {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
        	GenericsTypeC type = new GenericsTypeC();
		type.set("Hello"); 
		String str = (String) type.get(); 
		//type casting, error prone and can cause ClassCastException
	}

}
