package com;

public class Employee {
	private int eid;
	private String ename;
	private String eemail;
	private double salary;
	private int age;
	public Employee()
	{
		
	}
	public Employee(int eid, String ename, String eemail, double salary, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.salary = salary;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
}
