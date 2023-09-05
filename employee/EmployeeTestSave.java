package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTestSave {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Root@07";
		Connection connection=null;		
		
		try {
			//Step_1:Load and Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");//checked exception shown by compiler
			
			//Step_2:Establish Connection
			connection=DriverManager.getConnection(url,username,password);
			
			//Step3_3:Establish Connection
			Statement statement=connection.createStatement();
			
			//Step_4:Execute the statement
			statement.execute("INSERT INTO employee VALUES(1907,'Jane','jane@gmail.com')");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			//Step_5:Close Connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Closing the connection...");	
		}

	}
}
