package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
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
	
	@Before
	public void testInsert() {
		System.out.println("@Before: Insert 실행");
		UserInfo user = new UserInfo();
		user.setUser_id("test");
		user.setPassword("test");
		user.setSalt("test");
		user.setName("test");
		user.setCountry("대한민국");
		userService.insertUser(user);
		UserInfo user2 = userService.getUser("test");
		System.out.println("@@ userInfo: " + user);
		System.out.println("@@ insert- userInfo: " + user2);
	}
	
	@Test
	public void testUpdate() {
		UserInfo user = new UserInfo();
		user = userService.getUser("test");
		System.out.println("@@ userInfo: " + user);
		user.setPassword("aaa");
		user.setSalt("aaa");
		user.setName("aaa");
		user.setCountry("폴란드");
		userService.updateUser(user);
		UserInfo user2 = userService.getUser("test");
		System.out.println("@@ update - userInfo: " + user2);
		
	}
	
	@After
	public void testDelete() {
		System.out.println("@After: Delete 실행");
		userService.deleteUser("test");
		assertThat(userService.getUser("test")).isNull();
	}

}
