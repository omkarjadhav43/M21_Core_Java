package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "Mysql@2828";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "UPDATE employee SET NAME = ? , EMAIL_ID = ? WHERE ID = ?";
			PreparedStatement p = c.prepareStatement(query);
			p.setString(1, "OMKAR");
			p.setString(2, "capg43@gmail.com");
			p.setInt(3, 121);
			
			int r = p.executeUpdate();
			if(r > 0)
			{
				System.out.println("New User is updated successfully");
			}
			c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
