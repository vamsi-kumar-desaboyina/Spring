package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String sname;
	private int age;
	
	private Address address;
	public Student(){	
	}
	public Student(String sname, int age, Address address) {
		super();
		this.sname = sname;
		this.age = age;
		this.address = address;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
