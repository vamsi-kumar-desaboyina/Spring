package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("Hello");
		Student student = applicationContext.getBean("stu",Student.class);
		System.out.println(student);
		Student student2 = applicationContext.getBean("stu",Student.class);
		System.out.println(student==student2);//singleton
		System.out.println(student.getId());
		System.out.println("Bye");
		
	}

}
