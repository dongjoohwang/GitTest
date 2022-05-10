package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database2 {

	private Connection con;
	private PreparedStatement pstmt;
	
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	
	public Database2() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "woojoo69");
			System.out.println("접속");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if (pstmt!=null) {
				pstmt.close();
			} if (con!=null) {
				con.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mydbListData() {
		try {
			getConnection();
			
			String sql = "select * from member";
			
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) 
						+ ", " + rs.getString(2) 
						+ ", " + rs.getString(3) 
						+ ", " + rs.getString(4) + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public static void main(String[] args) {
		Database2 db = new Database2();
		db.getConnection();
		db.mydbListData();
	}

}


















