package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTestSelect {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Root@07";
		Connection connection=null;
		
		String sql="SELECT * FROM employee where id=1904";// to get particular record from a table 
		//String sql="SELECT * FROM student"; to get all records from table use this query 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url,username,password);
			
			Statement statement=connection.createStatement();
			 
			ResultSet resultSet=statement.executeQuery(sql);
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
		
		finally
		{
			try {
				connection.close();
				System.out.println("Closing the connection...");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		}
}
