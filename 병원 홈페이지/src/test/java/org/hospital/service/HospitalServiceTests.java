package org.hospital.service;

import org.hospital.criterial.HospitalCriterial;
import org.hospital.vo.HospitalVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HospitalServiceTests {

	@Autowired
	private HospitalService service;
	
	@Test
	public void testRegister() {
		HospitalVO vo = new HospitalVO();
		vo.setHosname("이지신경외과의원");
		vo.setAddress("경기도 고양시 일산동구 일산로 46(백석 2동) 남정씨티프라자 3층");
		vo.setPhone("031-903-1177");
		vo.setSubject("신경외과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00");
		vo.setClosetime("19:00(토 : 13:00)");
		vo.setHoliday("일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("이지신경외과의원");
		service.register(vo);
		log.info("생성된 게시물 번호 : " + vo.getHospitalslist());
	}
	
	@Test
	public void testRead() {
		service.get(2L);
	}
	
	@Test
	public void testDelete() {
		log.info("삭제된 개수 : " + service.remove(5L));
	}
	
	@Test 
	public void testGetList() {
		log.info("-----------------");
		service.getList(new HospitalCriterial(1,5));
	}
	
	@Test
	public void testModify() {
		HospitalVO vo = new HospitalVO();
		vo.setHospitalslist(1L);
		vo.setHosname("에센스 산부인과의원");
		vo.setAddress("경기도 의정부시 오목로 205번길 1 4층 401호(민락동)");
		vo.setPhone("031-852-7580");
		vo.setSubject("산부인과");
		vo.setWorkday("월~토");
		vo.setOpentime("09:00");
		vo.setClosetime("18:00(토 : 13:00)");
		vo.setHoliday("일");
		vo.setHolisubject("전부 휴진");
		vo.setLocation("에센스 산부인과의원");
		service.modify(vo);
		log.info("수정된 데이터 : " + service.modify(vo));
	}
}

















