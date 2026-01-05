package com;
import java.util.Properties;

public class Student {
	private String name;
	private Properties skills;
	public Student()
	{
		
	}
	public Student(String name, Properties skills) {
		super();
		this.name = name;
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Properties getSkills() {
		return skills;
	}
	public void setSkills(Properties skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", skills=" + skills + "]";
	}

}
