package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoards(BoardVO vo) {
		System.out.println("--> mybatis로 insertBoards() 기능 처리");
		mybatis.insert("BoardDAO.insertBoards", vo);	
	}
	public void updateBoards(BoardVO vo) {
		System.out.println("--> mybatis로 updateBoards() 기능 처리");
		mybatis.update("BoardDAO.updateBoards", vo);
		
	}
	public void deleteBoards(BoardVO vo) {
		System.out.println("--> mybatis로 deleteBoards() 기능 처리");
		mybatis.delete("BoardDAO.deleteBoards", vo);
	
	}
	public BoardVO getBoards(BoardVO vo) {
		System.out.println("--> mybatis로 getBoards() 기능 처리");
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoards", vo);
	}
	public List<BoardVO> getBoardsList(BoardVO vo) {
		System.out.println("--> mybatis로 getBoardsList() 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardsList", vo);
	}
}
