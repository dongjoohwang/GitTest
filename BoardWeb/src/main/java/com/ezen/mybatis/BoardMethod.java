package com.ezen.mybatis;

import java.util.List;

public interface BoardMethod {
	public BoardVo selectOne(int id);
	public List<BoardVo> selectAllMember();
	
	public void deleteBoard(int id);
	public void insertBoard(BoardVo vo);
	public void updateBoard(BoardVo vo);
}
