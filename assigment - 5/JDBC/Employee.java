package com.soch.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	
	public void create(String query, Connection con) throws SQLException
	{
		
		Statement st = con.createStatement(); //Create Statement
		
		st.execute(query);
		
		st.close(); // Close Statement
		
	}
	
	
	public void insert(String query, Connection con) throws SQLException
	{
		
		Statement st = con.createStatement(); //Create Statement
				
		st.execute(query);
		
		st.close(); // Close Statement

	}
	
	
	public void show(String query, Connection con) throws SQLException
	{
		
		Statement st = con.createStatement(); //Create Statement
				
		Boolean res = st.execute(query);
		
		System.out.println("Possible ResultSet : " + res);
		
		if (res) 
		{
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
			{
				System.out.println(" ");
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Salary : " + rs.getFloat(3));
				System.out.println("Address : " + rs.getString(4));
			}
		} 
		
		st.close();

	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish Connection with mysql DB
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch_jdbc?serverTimezone=UTC", "root", "");
				
		// 3. Build query
		
		String query1 = "CREATE TABLE employees (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY," + 
				"name varchar(100)," + 
				"salary float," + 
				"address varchar(100))";
		
		String query2 = "INSERT INTO employees (name, salary, address)" + 
				"VALUES ('Ram', '9900', 'Kathmandu')";
		
		String query3 = "Select * from employees";
		
		// 3. Create Employee instance
		
		Employee emp1 = new Employee();
		
//		emp1.create(query1, con); // Call create method
		
//		emp1.insert(query2, con); // Call insert method
		
		emp1.show(query3, con); // Call show method
		
		// 4. Close Connection
		
		con.close(); 

	}

