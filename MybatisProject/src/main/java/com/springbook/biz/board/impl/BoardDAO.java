package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoards(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoards", vo);
		mybatis.commit();
	}
	public void updateBoards(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoards", vo);
		mybatis.commit();
	}
	public void deleteBoards(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoards", vo);
		mybatis.commit();
	}
	public BoardVO getBoards(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoards", vo);
	}
	public List<BoardVO> getBoardsList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardsList", vo);
	}
}
