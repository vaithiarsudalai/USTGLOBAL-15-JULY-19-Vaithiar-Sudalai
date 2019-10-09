package com.ustglobal.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ustglobal.dev.beans.User;

public class UserInfoDaoImpl implements UserInfoDao {
	public UserInfoDaoImpl () {        //load the driver...when the object of this class is created, this constructor will be called and driver will be loaded
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static final String DBURL = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

	Scanner sc = new Scanner(System.in);

	@Override
	public User getAllInfo() {
		String query = "select * from Users_info";
		User u = new User();                    //object of getters setters class
		
		//when we write statement in try(statements..) block, this try is known as try with resources and when we use this we dont have to use finally block and close all the connections
		try (Connection con = DriverManager.getConnection(DBURL);   //connection has been established
				 Statement stm = con.createStatement();
				ResultSet re = stm.executeQuery(query)) {
			while (re.next()) {
				u.setUsername(re.getString(1));
				u.setUserid(re.getInt(2));
				u.setEmail(re.getString("email"));
				System.out.println(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void createProfile(User u) {
		String query = "insert into Users_info values(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(DBURL);
				PreparedStatement pst = con.prepareStatement(query)) {
			pst.setString(1, u.getUsername());
			pst.setInt(2, u.getUserid());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPasswd());
			int count = pst.executeUpdate();
			if (count > 0) {
				System.out.println("Query OK, "+count+" rows affected");
				System.out.println("Profile Created");
			} else {
				System.out.println("Creation failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
