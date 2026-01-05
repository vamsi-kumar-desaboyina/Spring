package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Student bean = applicationContext.getBean("stud",Student.class);
		Student bean1 = applicationContext.getBean("stud",Student.class);
		System.out.println(bean==bean1);
	}

}
