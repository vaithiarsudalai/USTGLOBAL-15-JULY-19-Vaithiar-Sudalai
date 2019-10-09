package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded......");
			
			// Get Connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			
			System.out.println("Enter the Username and Password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			con = DriverManager.getConnection(dbUrl,user,password);               
			System.out.println("Connection Established......");
			System.out.println("*********************************************************");
			
			
			// Issue the SQL query
			String query = "insert into Users_info values(?,?,?,?)";
			pst = con.prepareStatement(query);
			System.out.println("Enter UserName :");
			String st = sc.nextLine();
			pst.setString(1, st);
			System.out.println("Enter Userid :");
			int n = Integer.parseInt(sc.nextLine());
			pst.setInt(2, n);
			System.out.println("Enter Email :");
			String st1 = sc.nextLine();
			pst.setString(3, st1);
			System.out.println("Enter Password :");
			String st2 = sc.nextLine();
			pst.setString(4, st2);
			
			int count = pst.executeUpdate();
			
			if (count > 0) {
				System.out.println("Query OK, "+count+" row affected");
			} else {
				System.out.println("Insertion failed");
			}
			
		} catch (Exception e) {
			System.out.println("Insertion failed");
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}

	}

}
