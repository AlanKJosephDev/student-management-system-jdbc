package com.app.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL="jdbc:mysql://localhost:3306/student_db_jdbc";
	private static final String USER="root";
	private static final String PASSWORD="YOUR_DB_PASSWORD";// Set your MySQL password here (not committed for security reasons)
	
	private DBConnection() {}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
