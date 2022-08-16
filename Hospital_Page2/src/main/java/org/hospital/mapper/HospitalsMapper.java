package org.hospital.mapper;

import java.util.List;
import java.util.Map;

import org.hospital.domain.Criteria;
import org.hospital.domain.HospitalsVO;

public interface HospitalsMapper {
	public List<HospitalsVO> getList();
	public HospitalsVO read(Long bno);
	public int delete(Long bno);
	public int insert(HospitalsVO vo);
	public int insertSelectKey(HospitalsVO vo);
	public int update(HospitalsVO vo);
	public List<HospitalsVO> getListWithPagging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	//검색조건
	public List<HospitalsVO> searchTest( Map<String,  Map<String,String>> map);
}
