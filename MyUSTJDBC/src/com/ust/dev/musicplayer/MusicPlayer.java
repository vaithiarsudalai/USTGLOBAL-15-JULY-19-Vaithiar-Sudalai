package com.ust.dev.musicplayer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String filePath = "D:\\music.properties";
		FileReader reader = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(reader);
		Connection con = DriverManager.getConnection(prop.getProperty("url"), prop);

		System.out.println("Enter your choice");
		System.out.println("1 . Play a Song");
		System.out.println("2 . Search a Song");
		System.out.println("3 . Show all Songs");
		System.out.println("4 . Operate on Songs Database");
		System.out.println("****************************************************");
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			System.out.println("Enter your choice");
			System.out.println("A . Play all Songs");
			System.out.println("B . Play songs randomly");
			System.out.println("C . Play a particular song");
			System.out.println("****************************************************");
			String c1 = sc.nextLine();
			switch (c1) {
			case "A":
				Statement stm = con.createStatement();
				ResultSet re = stm.executeQuery(prop.getProperty("sql1"));
				while (re.next()) {
					System.out.println("Song Playing now : " + re.getString(2));
					System.out.println("****************************************************");
				}
				if(stm != null) {
					stm.close();
				}
				if(re != null) {
					re.close();
				}
				break;
			case "B":
				Statement stm1 = con.createStatement();
				ResultSet re1 = stm1.executeQuery(prop.getProperty("sql6"));
				while (re1.next()) {
					System.out.println("Song Playing now : " + re1.getString(2));
					System.out.println("****************************************************");
				}
				if(re1 != null) {
					re1.close();
				}
				if(stm1 != null) {
					stm1.close();
				}

				break;
			case "C":
				System.out.print("Enter Song name : ");
				String s = sc.nextLine();
				PreparedStatement pst = con.prepareStatement(prop.getProperty("sql2"));
				pst.setString(1, s);
				ResultSet re2 = pst.executeQuery();
				while (re2.next()) {
					System.out.println("Song Playing now : " + re2.getString(2));
					System.out.println("****************************************************");
				}
				if(pst != null) {
					pst.close();
				}
				if(re2 != null) {
					re2.close();
				}
				break;

			default:
				System.out.println("Select Valid Option");
				break;
			}
			break;

		case 2:
			System.out.print("Enter Song name : ");
			String s = sc.nextLine();
			PreparedStatement pst = con.prepareStatement(prop.getProperty("sql2"));
			pst.setString(1, s);
			ResultSet re2 = pst.executeQuery();
			while (re2.next()) {
				System.out.println("Song Id : " + re2.getInt(1));
				System.out.println("Song Name : " + re2.getString(2));
				System.out.println("Artist Name : " + re2.getString(3));
				System.out.println("Album Name : " + re2.getString(4));
				System.out.println("Description : " + re2.getString(5));
				System.out.println("****************************************************");
			}
			if(pst != null) {
				pst.close();
			}
			if(re2 != null) {
				re2.close();
			}

			break;

		case 3:
			Statement stm = con.createStatement();
			ResultSet re = stm.executeQuery(prop.getProperty("sql1"));
			while (re.next()) {
				System.out.println("Song Id : " + re.getInt(1));
				System.out.println("Song Playing : " + re.getString(2));
				System.out.println("Artist Name : " + re.getString(3));
				System.out.println("Album Name : " + re.getString(4));
				System.out.println("Description : " + re.getString(5));
				System.out.println("****************************************************");
			}
			if(stm != null) {
				stm.close();
			}
			if(re != null) {
				re.close();
			}
			break;

		case 4:
			System.out.println("Enter your choice");
			System.out.println("A . Insert a song");
			System.out.println("B . Edit a Song details");
			System.out.println("C . Delete the Songs");
			System.out.println("****************************************************");
			String c2 = sc.nextLine();
			switch (c2) {
			case "A":
				PreparedStatement pst1 = con.prepareStatement(prop.getProperty("sql3"));
				System.out.print("Enter Song Id : ");
				int i = Integer.parseInt(sc.nextLine());
				pst1.setInt(1, i);
				System.out.print("Enter Song name : ");
				String name = sc.nextLine();
				pst1.setString(2, name);
				System.out.print("Enter Artist name : ");
				String aname = sc.nextLine();
				pst1.setString(3, aname );
				System.out.print("Enter Album name : ");
				String arname = sc.nextLine();
				pst1.setString(4, arname );
				System.out.print("Enter Song Location : ");
				String sl = sc.nextLine();
				pst1.setString(5, sl);
				System.out.print("Enter Description : ");
				String des = sc.nextLine();
				pst1.setString(6, des);
				System.out.println("****************************************************");
				int count = pst1.executeUpdate();
				if (count > 0) {
					System.out.println("Song Inserted");
					System.out.println("****************************************************");
				} else {
					System.out.println("Song Insertion Unsuccessful");
					System.out.println("****************************************************");
				}
				if(pst1 != null) {
					pst1.close();
				}
				break;
			case "B":
				PreparedStatement pst2 = con.prepareStatement(prop.getProperty("sql4"));
				System.out.print("Enter New Name for the Song : ");
				pst2.setString(1, sc.nextLine());
				System.out.print("Enter  Song Id : ");
				pst2.setInt(2, Integer.parseInt(sc.nextLine()));
				System.out.println("****************************************************");
				int count2 = pst2.executeUpdate();
				if (count2 > 0) {
					System.out.println("Song Name Updated");
					System.out.println("****************************************************");
				} else {
					System.out.println("Song Name Upgradation Unsuccessful");
					System.out.println("****************************************************");
				}
				if(pst2 != null) {
					pst2.close();
				}
				break;

			case "C":
				PreparedStatement pst3 = con.prepareStatement(prop.getProperty("sql5"));
				System.out.print("Enter Song name : ");
				pst3.setString(1, sc.nextLine());
				System.out.println("****************************************************");
				int count5 = pst3.executeUpdate();
				if (count5 > 0) {
					System.out.println("Song Deleted");
					System.out.println("****************************************************");
				} else {
					System.out.println("Song Deletion Unsuccessful");
					System.out.println("****************************************************");
				}
				if(pst3 != null) {
					pst3.close();
				}
				break;

			default:
				System.out.println("Select Valid Option");
				break;
			}
			break;

		default:
			System.out.println("Select Valid Option");
			break;
		}

	}

}
