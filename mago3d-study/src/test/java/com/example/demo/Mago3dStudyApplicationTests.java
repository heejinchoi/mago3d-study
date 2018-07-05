package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class Mago3dStudyApplicationTests {
	
	@Autowired
	private SqlSessionFactory sqlSession;
	
	@Autowired
	private UserService userService;

	@Test @Ignore
	public void testSqlSession() throws Exception {
		System.out.println("sqlSession : " + sqlSession);
	}
	
	@Test @Ignore
	public void testInsert() {
		UserInfo user = new UserInfo();
		user.setUser_id("ccc");
		user.setPassword("ccc");
		user.setSalt("ccc");
		user.setName("ccc");
		user.setCountry("영국");
		userService.insertUser(user);
		UserInfo user2 = userService.getUser("test");
		System.out.println("userInfo: " + user);
		System.out.println("userInfo2: " + user2);
	}
	
	@Test 
	public void testUpdate() {
		UserInfo user = new UserInfo();
		user = userService.getUser("ccc");
		System.out.println("@@ userInfo: " + user);
		user.setPassword("rrr");
		user.setSalt("rrr");
		user.setName("rrr");
		user.setCountry("아일랜드");
		userService.updateUser(user);
		UserInfo user2 = userService.getUser("ccc");
		System.out.println("@@ update - userInfo: " + user2);
		
	}

}
