package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flm", "root", "VamsiKumar@12345");
		    Statement statement = connection.createStatement();
		    int eid=34;
		    String ename="ram";
		    String eemail="ram@gmail.com";
		    double esalary=3232.54;
		    int eage=23;
		    String query="insert into employee values(eid,ename,eemail,esalary,eage)";
		    statement.executeUpdate(query);
		
	}

}
