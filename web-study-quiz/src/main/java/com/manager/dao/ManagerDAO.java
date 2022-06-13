package com.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ManagerDAO {
	private ManagerDAO() {
		
	}
	
	private static ManagerDAO instance = new ManagerDAO();
	
	public static ManagerDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
	
	public int userCheck(String userid, String pwd) {
		int result = -1;
		String sql = "select pwd from employees where userid=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, userid);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				if (rs.getString("pwd").equals(pwd) &&
						rs.getString("pwd") != null) {
					result = 1;
				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pst != null) pst.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}












