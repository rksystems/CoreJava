package com.unnatisoft.clone;

import java.io.Serializable;

public class Address implements Serializable {
	public String street;
	public String pin;

	public Address() {
		super();
		this.street = "SSS";
		this.pin = "PPP";
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}

}