package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container
		= new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
//		vo.setSeq(0);
		vo.setTitle("임시 제목");
		vo.setWritter("홍길동");
		vo.setContent("임시 내용...........");
		boardService.insertBoards(vo);
		
		List<BoardVO> boardsList = boardService.getBoardsList(vo);
		for(BoardVO boards : boardsList) {
			System.out.println("--> : " + boards.toString());
		}
		container.close();
	}

}











