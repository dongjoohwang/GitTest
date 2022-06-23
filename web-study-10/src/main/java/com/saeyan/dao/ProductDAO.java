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
	
	public List<ProductVO> selectAllProdcuts(){
		List<ProductVO> list =  new ArrayList<ProductVO>();
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String sql = "select * from product order by code desc";
		
		try {
				conn = DBManager.getConnection();
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

	//insert
	public int insertProduct(ProductVO pVo) {
		int result = -1;
		
		String sql = "insert into product values(product_seq.nextval, ?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pVo.getName());
				pstmt.setInt(2, pVo.getPrice());
				pstmt.setString(3,pVo.getPictureurl());
				pstmt.setString(4, pVo.getDescription());
				
				result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			DBManager.closeConnection(conn, pstmt);
		}
		
		return result;
	}

	public ProductVO selectProductByCode(String code) {
			ProductVO pVo = new ProductVO();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from product where code = ?";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, code);
				rs = pstmt.executeQuery();
			   
				if(rs.next()) {
					pVo.setCode(rs.getInt(1));
					pVo.setName(rs.getString(2));
					pVo.setPrice(rs.getInt(3));
					pVo.setPictureurl(rs.getString(4));
					pVo.setDescription(rs.getString(5));
			   }
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeConnection(conn, pstmt, rs);
			}
			
		return pVo;
	}
	
	public void updateProduct(ProductVO pVo) {
		String sql = "update product set name=?, price=?, pictureurl=?, description=? where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVo.getName());
			pstmt.setInt(2, pVo.getPrice());
			pstmt.setString(3, pVo.getPictureurl());
			pstmt.setString(4, pVo.getDescription());
			pstmt.setInt(5, pVo.getCode());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
	public void deleteProduct(String code) {
		String sql = "delete product where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
	
}















