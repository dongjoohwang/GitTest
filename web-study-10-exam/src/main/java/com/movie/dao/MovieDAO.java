package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.MovieVO;

import util.DBManager;

public class MovieDAO {

	private MovieDAO() {}
	
	private static MovieDAO instance = new MovieDAO();
	public static MovieDAO getInstance() {
		return instance;
	}
	
	public List<MovieVO> selectAllMovies() {
		List<MovieVO> list = new ArrayList<MovieVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from movie order by code desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MovieVO vo = new MovieVO();
				vo.setCode(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPrice(rs.getInt(3));
				vo.setDirector(rs.getString(4));
				vo.setActor(rs.getString(5));
				vo.setPoster(rs.getString(6));
				vo.setSynopsis(rs.getString(7));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		return list;
	}
	
	public int insertMovie(MovieVO mvo) {
		int result = -1;
		String sql = "insert into movie values(movie_seq.nextval, ?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = DBManager.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, mvo.getTitle());
			pst.setInt(2, mvo.getPrice());
			pst.setString(3, mvo.getDirector());
			pst.setString(4, mvo.getActor());
			pst.setString(5, mvo.getPoster());
			pst.setString(6, mvo.getSynopsis());
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pst);
		}
		return result;
		
		
	}
}















