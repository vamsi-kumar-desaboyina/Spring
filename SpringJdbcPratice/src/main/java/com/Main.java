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
		JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
//		jdbcTemplate.update("insert into stu values(?,?)","kong",7);
//		jdbcTemplate.update("update stu set sname=? where sid=?","king",7);
//		jdbcTemplate.update("delete from stu where sid=?",7);
//		Stu queryForObject = jdbcTemplate.queryForObject("select * from stu where sid=1", new RowMapper<Stu>()
//		{
//			@Override
//			public Stu mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				return new Stu(rs.getString(1),rs.getInt(2));
//			}
//		});
//		System.out.println(queryForObject);
//		Stu queryForObject = jdbcTemplate.queryForObject("select * from stu where sid=?", new RowMapper<Stu>()
//		{
//			@Override
//			public Stu mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				return new Stu(rs.getString(1),rs.getInt(2));
//			}
//		},2);
//		System.out.println(queryForObject);
		List<Stu> queryForObject = jdbcTemplate.query("select * from stu", new RowMapper<Stu>()
		{
			@Override
			public Stu mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Stu(rs.getString(1),rs.getInt(2));
			}
		});
		System.out.println(queryForObject);
	}

}
