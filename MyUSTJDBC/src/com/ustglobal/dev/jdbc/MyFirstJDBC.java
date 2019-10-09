package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection con = null;                                        //  Connection from java.sql
		Statement stm = null;
		ResultSet rs = null;

		try {
			// Load the Driver
			java.sql.Driver div = new Driver();                          // Driver from com.mysql.jdbc.Driver
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded....");                 // To register the Driver use registerDriver using DriverManager

			// Get Connection Via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

			con = DriverManager.getConnection(dbUrl);               // getConnection helps us to get connection
			System.out.println("Connection Established......");
			System.out.println("*****************************************");
			
			// Issue SQL query via Connection
			String query = "select * from Users_info"; 
			stm = con.createStatement();                                  // To convert String into SQL Statement (returns statement) 
			rs = stm.executeQuery(query);                                  // To execute the Query we need perform executeQuery on the statement (returns ResultSet)
			
			// Process the (ResultSet) results returned SQL query
			while (rs.next()) {
				String username = rs.getString("Username");
				int userid = rs.getInt("Userid");                          // To get int value from table into your java program
				String email = rs.getString("email");
				System.out.println("User Id : "+userid);
				System.out.println("Username : "+username);
				System.out.println("Email : "+email);
				System.out.println("**************************************************");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			// Closing all the JDBC objects
			
			if (con != null) {
				try {
					con.close();                                          // Closing connection
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (stm != null) {
				try {
					stm.close();                                        // Closing statement
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (rs != null) {
				try {
					rs.close();                                         // Closing Resultset
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
