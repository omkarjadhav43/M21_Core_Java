package com.cg.dbcrud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "Mysql@2828";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "INSERT INTO EMPLOYEE(ID,NAME,EMAIL_ID,PASSWORD)VALUES(?,?,?,?)";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 121);
			p.setString(2, "adi");
			p.setString(4, "adi123");
			p.setString(3, "adi34@gmail.com");
			int r = p.executeUpdate();
			//If row is greater than 0 then at least some rows are there
			if(r > 0)
			{
				System.out.println("New User is Inserted successfully");
				c.close();
			}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
