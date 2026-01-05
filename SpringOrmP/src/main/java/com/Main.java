package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.Dao.StudentDao;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		StudentDao bean = applicationContext.getBean("studentDao",StudentDao.class);
		Student student = bean.getStudent(2);
		System.out.println(student);
		bean.saveStudent(new Student(24,"dsds","des@gmail.com"));
	}

}
