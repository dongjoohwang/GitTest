package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("새로 작성");
		vo.setContent("하는 내용");
		vo.setWriter("new");
		service.register(vo);
		log.info("생성된 개시물 번호 : " + vo.getBno());
	}
	
	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		vo.setBno(12L);
		vo.setTitle("새로");
		vo.setContent("작성");
		vo.setWriter("new");
		log.info("modify--------------");
		log.info("수정 : " + service.modify(vo)); 
	}
	
	@Test
	public void testRemove() {
		
		log.info("remove--------------");
		log.info("삭제 : " + service.remove(9L));
	}
	
	@Test
	public void testGet() {
		
		log.info("read--------------");
		log.info("불러오기 : " + service.get(3L));
	}
	@Test
	public void testGetList() {
		
		for(BoardVO vo : service.getList()) {
			log.info(vo);
		}
	}
	
	
}











