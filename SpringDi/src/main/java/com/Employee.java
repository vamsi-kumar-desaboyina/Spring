package com;
import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
	private int eid;
	private Address address;
	public Employee()
	{
		
	}	
	@Autowired
	public Employee(int eid, Address address) {
		super();
		this.eid = eid;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", address=" + address + "]";
	}
}
