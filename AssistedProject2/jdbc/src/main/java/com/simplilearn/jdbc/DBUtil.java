package com.simplilearn.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	public static Connection getDBConnection() {
		
		//step1 Register Driver
		
		Connection conn = null;
		try {
			  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//step2 Get DB Connection
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Tiger");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return conn ;
	}

}
