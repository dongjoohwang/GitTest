package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	
	private ProductDAO() {}
	
	//싱글톤 객체 생성
	private static ProductDAO instance  = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public List<ProductVO> selectAllProducts(){
		List<ProductVO> list =  new ArrayList<ProductVO>();
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String sql = "select * from product order by code desc";
		
		try {
				conn = DBManager.getConnetion();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					ProductVO vo = new ProductVO();
					vo.setCode(rs.getInt(1));
					vo.setName(rs.getString(2));
					vo.setPrice(rs.getInt(3));
					vo.setPictureurl(rs.getString(4));
					vo.setDescription(rs.getString(5));
					list.add(vo);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		return list;
	}

	public int insertProduct(ProductVO pVo) {
		int result = -1;
		String sql = "insert into product values(product_seq.nextval, ?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnetion();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVo.getName());
			pstmt.setInt(2, pVo.getPrice());
			pstmt.setString(3, pVo.getPictureurl());
			pstmt.setString(4, pVo.getDescription());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pstmt);
		}
		
		return result;
	}
	
}
