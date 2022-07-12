package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@Log4j
public class TimeMapperTests {
	
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("--------------");
		log.info("info1 : " + timeMapper.getClass().getName());
		log.info("info2 : " + timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		log.info("---------------");
		log.info("info1 : " + timeMapper.getClass().getName());
		log.info("getTime2 : " + timeMapper.getTime2());
	}
}













