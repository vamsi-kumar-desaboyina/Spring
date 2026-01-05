package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbctemplate",JdbcTemplate.class);
		jdbcTemplate.update("insert into employee values(?,?,?,?,?)",223,"fdsf","fdsfd@gmail.com",43343,44);
	}

}
