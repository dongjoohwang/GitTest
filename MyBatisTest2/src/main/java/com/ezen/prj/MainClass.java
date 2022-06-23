package com.ezen.prj;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainClass {

	public static void main(String[] args) {
		String resource = "com/ezen/prj/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
				 
			mapperInterface mapper = session.getMapper(mapperInterface.class);
		    BoardVO vo = mapper.selectOne(1);
		    System.out.println(vo.toString());
		    System.out.println("------------");
		    
		    List<BoardVO> list = mapper.selectAllMember();
		    for(BoardVO vo2 : list)
		    	System.out.println(vo2.toString());
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}












