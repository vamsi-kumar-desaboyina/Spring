package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	public Student()
	{
		
	}
	public Student(int sid, String name, String email) {
		super();
		this.id = sid;
		this.name = name;
		this.email = email;
	}
	public int getSid() {
		return id;
	}
	public void setSid(int sid) {
		this.id = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
