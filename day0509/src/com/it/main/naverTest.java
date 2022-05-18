package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class naverTest {

	private Connection con;
	private PreparedStatement pstmt;
	
	private final String URL = "jdbc:mysql://localhost:3306/navertest?serverTimezone=UTC";
	
	public naverTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "woojoo69");
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnection() {
		try {
			if(pstmt != null ) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navertestListData() {
		
	}
	
	public static void main(String[] args) {

		naverTest nv = new naverTest();
		nv.getConnection();
	}

}












