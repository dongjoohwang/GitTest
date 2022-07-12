package com.springbook.biz.board;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BoardServiceClient {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			Board boards = new Board();
			boards.setTitle("JPA 제목");
			boards.setWritter("관리자");
			boards.setContent("JPA 등록");
			em.persist(boards);
			
			String jpql = "select b from Board b order by b.seq desc";
			List<Board> boardsList = em.createQuery(jpql, Board.class).getResultList();
			
			for(Board brd : boardsList) {
				System.out.println("--> " + brd.toString());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();
	}
}
