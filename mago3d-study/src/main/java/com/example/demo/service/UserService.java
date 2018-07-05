package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.UserInfo;

public interface UserService {

	Long getUserTotalCount(UserInfo userInfo);
	
	List<UserInfo> getUserList(UserInfo userInfo);
	
	UserInfo getUser(String user_id);
	
	int insertUser(UserInfo userInfo);
	
	int updateUser(UserInfo userInfo);
	
	int deleteUser(String user_id);
	
}
