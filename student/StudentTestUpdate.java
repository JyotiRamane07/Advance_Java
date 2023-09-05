package com.jsp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentTestUpdate {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Root@07";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url,username,password);
			
			Statement statement=connection.createStatement();
			 
			int a=statement.executeUpdate("UPDATE student SET name='JR', email='jr07@gmail.com' where id=4");
			if(a>0)
			{
				System.out.println("UPDATED");
			}
			else
			{
				System.out.println("Not UPDATED");
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
