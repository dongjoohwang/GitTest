package com.springbook.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {
	public static void main(String[] args) throws SQLException {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("myBatis 제목");
		vo.setWritter("홍길동");
		vo.setContent("myBatis 내용");
		boardDAO.insertBoards(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardsList = boardDAO.getBoardsList(vo);
		for(BoardVO boards : boardsList) 
			System.out.println("---> " + boards.toString());
	}
}
