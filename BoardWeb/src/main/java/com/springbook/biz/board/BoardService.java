package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	void insertBoards(BoardVO vo);
	void updateBoards(BoardVO vo);
	void deleteBoards(BoardVO vo);
	BoardVO getBoards(BoardVO vo);
	List<BoardVO> getBoardsList(BoardVO vo);
}
