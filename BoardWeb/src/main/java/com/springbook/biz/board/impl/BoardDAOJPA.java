package com.springbook.biz.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;


@Repository
public class BoardDAOJPA {

	@PersistenceContext
	private EntityManager em;
	
	public void insertBoards(BoardVO vo) {
		System.out.println("---> JPA로 insertBoards() 기능 처리");
		em.persist(vo);
	}
	
	public void updateBoards(BoardVO vo) {
		System.out.println("---> JPA로 updateBoards() 기능 처리");
		em.merge(vo);
	}
	
	public void deleteBoards(BoardVO vo) {
		System.out.println("---> JPA로 deleteBoards() 기능 처리");
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	}
	
	public BoardVO getBoards(BoardVO vo) {
		System.out.println("---> JPA로 getBoards() 기능 처리");
		return (BoardVO) em.find(BoardVO.class, vo.getSeq());
		
	}
	
	@SuppressWarnings("unchecked")
	public List<BoardVO> getBoardsList(BoardVO vo) {
		System.out.println("---> JPA로 getBoardsList() 기능 처리");
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}
}
