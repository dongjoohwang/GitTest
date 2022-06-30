package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOSpring extends JdbcDaoSupport {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARDS_INSERT 
	= "insert into boards(seq, title, writter, content) values((select nvl(max(seq), 0)+1 from boards),?,?,?)";
	private final String BOARDS_UPDATE = "update boards set title=?, content=? where seq=?";	
	private final String BOARDS_DELETE = "delete boards where seq=?";
	private final String BOARDS_GET = "select * from boards where seq=?";
	private final String BOARDS_LIST = "select * from boards order by seq desc";
	
	@Autowired
	public void setSuperDataSource(DataSource datasource) {
		super.setDataSource(datasource);
	}
	
	public void insertBoards(BoardVO vo) {
		System.out.println("---> Spring JDBC로 insertBoards() 기능 처리");
		jdbcTemplate.update(BOARDS_INSERT, vo.getTitle(), vo.getWritter(), vo.getContent());
	}
	
	public void updateBoards(BoardVO vo) {
		System.out.println("---> Spring JDBC로 updateBoards() 기능 처리");
		jdbcTemplate.update(BOARDS_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}
	
	public void deleteBoards(BoardVO vo) {
		System.out.println("---> Spring JDBC로 deleteBoards() 기능 처리");
		jdbcTemplate.update(BOARDS_DELETE, vo.getSeq());
	}
	
	public BoardVO getBoards(BoardVO vo) {
		System.out.println("---> Spring JDBC로 getBoards() 기능 처리");
		Object[] args = {vo.getSeq()};
		return jdbcTemplate.queryForObject(BOARDS_GET, args, new BoardRowMapper());
	}
	
	public List<BoardVO> getBoardsList(BoardVO vo) {
		System.out.println("---> Spring JDBC로 deleteBoards() 기능 처리");
		return jdbcTemplate.query(BOARDS_LIST, new BoardRowMapper());
	}
	
	class BoardRowMapper implements RowMapper<BoardVO> {

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO boards = new BoardVO();
			boards.setSeq(rs.getInt("SEQ"));
			boards.setTitle(rs.getString("TITLE"));
			boards.setWritter(rs.getString("WRITTER"));
			boards.setContent(rs.getString("CONTENT"));
			boards.setRegDate(rs.getDate("REGDATE"));
			boards.setCnt(rs.getInt("CNT"));
			return boards;
		}
		
	}
}














