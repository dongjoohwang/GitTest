package com.ezen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisMain {
	public static void main(String[] args) {
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
			
			BoardMethod mapper = session.getMapper(BoardMethod.class);
			BoardVo vo = mapper.selectOne(1);
			System.out.println(vo.toString());
//			mapper.deleteBoard(5);
			
//			BoardVo vo3 = new BoardVo();
//			vo3.setId(8);
//			vo3.setName("pole");
//			vo3.setPhone("010-1999-3312");
//			vo3.setAddress("경기도 이천시");
//			mapper.insertBoard(vo3);
			
			vo.setId(1);
			vo.setName("손흥민");
			vo.setPhone("010-1231-3311");
			vo.setAddress("busan");
			mapper.updateBoard(vo);
			session.commit();
			System.out.println("====================");
			
			List<BoardVo> list = mapper.selectAllMember();
			for(BoardVo vo2 : list)
				System.out.println(vo2.toString());
			
			
//			inputStream = Resources.getResourceAsStream(resource);
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//					
//					SqlSession session = sqlSessionFactory.openSession();
//					System.out.println("sqlSessionFactory : " + sqlSessionFactory);
//					System.out.println("Session : " + session);
//					BoardMethod mapper = session.getMapper(BoardMethod.class);
//					
//					BoardVo vo = mapper.selectOne(1);
//					System.out.println(vo.getId());
//					System.out.println(vo.getName());
//					System.out.println(vo.getPhone());
//					System.out.println(vo.getAddress());
//					
//					vo = mapper.selectOne(2);
//					System.out.println(vo.getId());
//					System.out.println(vo.getName());
//					System.out.println(vo.getPhone());
//					System.out.println(vo.getAddress());
//					
//					vo = mapper.selectOne(3);
//					System.out.println(vo.getId());
//					System.out.println(vo.getName());
//					System.out.println(vo.getPhone());
//					System.out.println(vo.getAddress());
//					
//					vo = mapper.selectOne(4);
//					System.out.println(vo.getId());
//					System.out.println(vo.getName());
//					System.out.println(vo.getPhone());
//					System.out.println(vo.getAddress());
//					
//					vo = mapper.selectOne(5);
//					System.out.println(vo.getId());
//					System.out.println(vo.getName());
//					System.out.println(vo.getPhone());
//					System.out.println(vo.getAddress());
//					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}













