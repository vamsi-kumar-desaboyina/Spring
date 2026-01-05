package com.Dao;

import javax.management.RuntimeErrorException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Student;

import jakarta.transaction.Transactional;
@Transactional 
@Component
public class StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	public Student getStudent(int id)
	{
		Session session = getSession();
		Student student = session.find(Student.class, id);
		return student;
	}
	public Session getSession()
	{
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	public void saveStudent(Student student)
	{
		Session session = getSession();
		session.persist(student);
//		if(true)
//		{
//			throw new RuntimeException();
//		}
		session.persist(new Student(45, "yre", "yye@gmail.com"));
	}
}
