package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class Mago3dStudyApplicationTests {
	
	@Autowired
	private SqlSessionFactory sqlSession;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSqlSession() throws Exception {
		System.out.println("sqlSession : " + sqlSession);
	}

}
