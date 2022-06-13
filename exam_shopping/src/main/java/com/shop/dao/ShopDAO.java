package com.shop.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.shop.dto.ShopVO;

public class ShopDAO {

	private ShopDAO() { }
	
	private static ShopDAO instance = new ShopDAO();
	
	public static ShopDAO getInstance() {
		return instance;
	}
	
	public Connection getConncetion() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}

	public List<ShopVO> insertShop(int custno) {
//		--1 custno 회원번호 number 6 NOT NULL Primary Key
//		--2 custname 회원성명 varchar2 20
//		--3 phone 회원전화 varchar2 13
//		--4 address 주소 varchar2 60
//		--5 joindate 가입일자 date
//		--6 grade 고객등급 char 1
//		--7 city 거주도시 char 2
		
		List<ShopVO> list = new ArrayList<ShopVO>();
		
		String sql = "insert into member_tbl_02 values(?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = getConncetion();
			pst = conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while (rs.next()) {
				
				ShopVO svo = new ShopVO();
				
				svo.setCustno(rs.getInt("custno"));
				svo.setCustname(rs.getString("custname"));
				svo.setPhone(rs.getString("phone"));
				svo.setAddress(rs.getString("address"));
				svo.setJoindate(rs.getDate("joindate"));
				svo.setGrade(rs.getString("grade"));
				svo.setCity(rs.getString("city"));
				
				list.add(svo);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pst!=null) pst.close();
				if(conn!=null) pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
		
	}
}

















