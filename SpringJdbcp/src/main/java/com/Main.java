package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbctemplate",JdbcTemplate.class);
		//jdbcTemplate.update("insert into employee values(?,?,?,?,?)",100,"kohli","kohli@gmail.com",11211.00,34);
		Employee employee = jdbcTemplate.queryForObject("select * from employee where eid=?", new RowMapper<Employee>()
				{

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
					}
			
				},3);
		System.out.println(employee);
		List<Employee> query = jdbcTemplate.query("select * from employee", new RowMapper<Employee>()
		{

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
			}
	
		});
		System.out.println(query);
		List<Employee> query2 = jdbcTemplate.query("select * from employee", (rs,rowNum)->{
			return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
		});
		System.out.println(query2);
	}

}
