package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradation {

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
			System.out.println("Enter Username and Password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			con = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection Established.........");
			System.out.println("*****************************************");

			// Issue SQL queries
			String query = "update Users_info set email = ? where Userid = ? AND password = ?";
			pst = con.prepareStatement(query);
			System.out.println("Enter the new Email id......");
			pst.setString(1, sc.nextLine());
			System.out.println("Enter user id.....");
			pst.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password.....");
			pst.setString(3, sc.nextLine());

			// Process the result of SQL statement

			int count = pst.executeUpdate();

			if (count > 0) {
				System.out.println("Query OK, "+count+" row affected");
			} else {
				System.out.println("Upgradation failed");
			}


		} catch (Exception e) {
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


