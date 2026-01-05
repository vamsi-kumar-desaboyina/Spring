package com;

public class Student {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student()
	{
		System.out.println("Student class");
	}
	public Student(int id)
	{
		this.id=id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}
//<property name="id" value="123"></property>
//<property name="id"><value>123</value></property>