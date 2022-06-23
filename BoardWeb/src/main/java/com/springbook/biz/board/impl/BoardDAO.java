package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String BOARDS_INSERT 
	= "insert into boards(seq, title, writter, content) values((select nvl(max(seq), 0)+1 from boards),?,?,?)";
	private final String BOARDS_UPDATE = "update boards set title=?, content=? where seq=?";	
	private final String BOARDS_DELETE = "delete boards where seq=?";
	private final String BOARDS_GET = "select * from boards where seq=?";
	private final String BOARDS_LIST = "select * from boards order by seq desc";
	
	public void insertBoards(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoards() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDS_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWritter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	public void updateBoards(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoards() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDS_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	public void deleteBoards(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoards() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDS_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
			
	public BoardVO getBoards(BoardVO vo) {
		System.out.println("===> JDBC로 getBoards() 기능 처리");
		BoardVO boards = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDS_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if(rs.next()) {
				boards = new BoardVO();
				boards.setSeq(rs.getInt(1));
				boards.setTitle(rs.getString(2));
				boards.setWritter(rs.getString(3));
				boards.setContent(rs.getString(4));
				boards.setRegDate(rs.getDate(5));
				boards.setCnt(rs.getInt(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boards;
	}
	public List<BoardVO> getBoardsList(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardsList() 기능 처리");
		List<BoardVO> boardsList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDS_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO boards = new BoardVO();
				boards.setSeq(rs.getInt(1));
				boards.setTitle(rs.getString(2));
				boards.setWritter(rs.getString(3));
				boards.setContent(rs.getString(4));
				boards.setRegDate(rs.getDate(5));
				boards.setCnt(rs.getInt(6));
				boardsList.add(boards);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardsList;
	}
	
	
}



















