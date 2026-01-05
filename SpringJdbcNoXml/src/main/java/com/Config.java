package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	@Bean("jdbctemplate")
	public JdbcTemplate getjdbcTemplate()
	{
		DataSource dataSource = getDataSource();
		return new JdbcTemplate(dataSource);
	}
	
	@Bean("datasource")
	public DataSource getDataSource()
	{
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/flm","root","VamsiKumar@12345");
	}
}
