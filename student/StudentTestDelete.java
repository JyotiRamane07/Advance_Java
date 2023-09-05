package com.jsp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentTestDelete {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Root@07";
		Connection connection=null;
		String sql="DELETE FROM student where id=2";
		
		//STEP 1:Load/Register the driver
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//STEp 2:Establish Connection
			connection=DriverManager.getConnection(url,username,password);
			
		//STEP 3:Establish statement
			Statement statement=connection.createStatement();
			
		//STEP 4:Execute the statement
		statement.execute(sql);
		
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			//STEP 5:Close Connection
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
