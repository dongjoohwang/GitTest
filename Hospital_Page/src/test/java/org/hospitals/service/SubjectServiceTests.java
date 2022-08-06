package org.hospitals.service;

import org.hospital.domain.Criteria;
import org.hospital.service.SubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SubjectServiceTests {

	@Autowired
	private SubjectService service;
	
	@Test
	public void testGetList() {
		log.info("----------------------------");
		service.getList(new Criteria(2,10));
	}
}
