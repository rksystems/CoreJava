package com.unnatisoft.generics;

import com.unnatisoft.oops.inheritance.JerseyCow;

public class GenericsType<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		GenericsType<String> type = new GenericsType<>();
		type.setT("Hello"); // valid

		GenericsType type1 = new GenericsType(); // raw type
		type1.setT("World"); // valid
		type1.setT(10); // valid and autoboxing support
		type1.setT(new JerseyCow());
		GenericsType<JerseyCow> type2 = new GenericsType();
		type2.setT(new JerseyCow());
	}
}
