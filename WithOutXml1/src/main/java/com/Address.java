package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${area}")
	private String area;
	@Value("${pincode}")
	private int pincode;
	public Address()
	{
		
	}
	public Address(String area, int pincode) {
		super();
		this.area = area;
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", pincode=" + pincode + "]";
	}
}
