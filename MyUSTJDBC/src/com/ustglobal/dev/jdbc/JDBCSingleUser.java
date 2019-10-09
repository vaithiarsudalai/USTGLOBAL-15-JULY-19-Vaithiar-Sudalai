package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCSingleUser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pst = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...........");
			
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			String filePath = "D:\\db.properties";
			FileReader reader = new FileReader(filePath);
			
			Properties props = new Properties();
			props.load(reader);
			
			con = DriverManager.getConnection(dbUrl, props);
			System.out.println("Connection Established..............");
			
			String query = "select * from Users_info where Userid = ? AND password = ?";
			pst = con.prepareStatement(query);
			
			System.out.println("Enter User id:");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password :");
			pst.setString(2, sc.nextLine());
			
			rs = pst.executeQuery();
			
			while (rs.next()) {
			String username = rs.getString("Username");
			int userid = rs.getInt("Userid");                          
			String email = rs.getString("email");
			System.out.println("User Id : "+userid);
			System.out.println("Username : "+username);
			System.out.println("Email : "+email);
			System.out.println("**************************************************");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}  finally {
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
