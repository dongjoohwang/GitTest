package com.bookshop01.member.service;

import java.util.Map;

import com.bookshop01.member.vo.MemberVO;

// 로그인
public interface MemberService {
	public MemberVO login(Map  loginMap) throws Exception;			// 로그인
	public void addMember(MemberVO memberVO) throws Exception;		// 회원 추가
	public String overlapped(String id) throws Exception;			// 회원 정보 수정
}
