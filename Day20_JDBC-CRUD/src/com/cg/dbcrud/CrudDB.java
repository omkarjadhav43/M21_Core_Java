package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "Mysql@2828";
		
		try
		{
			// To check whether eclipse is connected with MySQL or not.
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			if(c!=null)
			{
				//Once connected, We have to close it.
				System.out.println("Connection is established");
				c.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
