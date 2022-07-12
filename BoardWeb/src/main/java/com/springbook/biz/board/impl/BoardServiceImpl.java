package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
//	private BoardDAOSpring boardDAO;
	private BoardDAOMybatis boardDAO;
//	private BoardDAOJPA boardDAO;
	
	
	@Override
	public void insertBoards(BoardVO vo) {
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoards(vo);
	}

	@Override
	public void updateBoards(BoardVO vo) {
		boardDAO.updateBoards(vo);
	}

	@Override
	public void deleteBoards(BoardVO vo) {
		boardDAO.deleteBoards(vo);
	}

	@Override
	public BoardVO getBoards(BoardVO vo) {
		return boardDAO.getBoards(vo);
	}

	@Override
	public List<BoardVO> getBoardsList(BoardVO vo) {
		return boardDAO.getBoardsList(vo);
	}

}








