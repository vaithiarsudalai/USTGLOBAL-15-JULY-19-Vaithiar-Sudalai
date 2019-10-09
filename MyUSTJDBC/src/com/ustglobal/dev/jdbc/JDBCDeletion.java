package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

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
			String filePath = "D:\\db.properties";

			FileReader reader = new FileReader(filePath);

			Properties props = new Properties();
			props.load(reader);

			con = DriverManager.getConnection(dbUrl, props);

			System.out.println("Connection Established.........");
			System.out.println("*****************************************");

			// Issue SQL queries
			String query = "Delete from Users_info where Userid = ? AND password = ?";
			pst = con.prepareStatement(query);
			System.out.println("Enter user id.....");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password.....");
			pst.setString(2, sc.nextLine());

			// Process the result of SQL statement

			int count = pst.executeUpdate();

			if (count > 0) {
				System.out.println("Query OK, " + count + " row affected");
			} else {
				System.out.println("Deletion failed");
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
