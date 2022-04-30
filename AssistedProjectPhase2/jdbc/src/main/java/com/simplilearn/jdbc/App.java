package com.simplilearn.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection conn = DBUtil.getDBConnection();
       
       
       try {
    	  // String insert = "insert into employee values(?,?,current_date,?)"; //? postional params
      
    	   String update = "update employee set ename = ? , salary = ? where eid = ?";
    	   PreparedStatement pstmt = conn.prepareStatement(update);
       
    	  /* // insert query
           pstmt.setInt(1, 111);
           pstmt.setString(2, "banerjee");
           pstmt.setInt(3,  50000);
           */
    	   
    	   pstmt.setString(1, "tom cruise");
    	   pstmt.setInt(2,  45000);
    	   pstmt.setInt(3,  102);
       
       int count = pstmt.executeUpdate();
       System.out.println(count +"records effected...");
       
       } catch (SQLException e) {
    	   e.printStackTrace();
       }
       
    }
}
