package com.university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection connection;
	String url = "jdbc:mysql://localhost:3306/University";
	String uname = "root";
	String password = "Parth@123";
	
	public DBConnection(String url,String uname,String password) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(url,uname,password);
	}
	
	public Connection getConnection() {
		return this.connection;
		
	}
	
	public void closeConnection() throws SQLException {
		if(this.connection!=null) {
			this.connection.close();
		}
	}

}
