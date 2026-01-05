package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.Dao.StudentDao;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		StudentDao bean = applicationContext.getBean("studentDao",StudentDao.class);
		Student student = bean.getStudent(1);
		System.out.println(student);
		bean.saveStudent(new Student(25,"lkjh","des@gmail.com"));
	}

}
