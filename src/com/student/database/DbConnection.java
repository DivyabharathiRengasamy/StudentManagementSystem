package com.student.database;

import java.sql.*;
public class DbConnection {
	
	    static final String DB_URL = "jdbc:mysql://localhost/student_database";
	    static final String USER = "root";
	    static final String PASS = "Divya@22";
	    
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("connected");
		return DriverManager.getConnection(DB_URL,USER,PASS);
	}
	

}
