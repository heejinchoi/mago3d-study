package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.UserInfo;
import com.example.demo.persistence.UserMapper;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Long getUserTotalCount(UserInfo userInfo) {
		return userMapper.getUserTotalCount(userInfo);
	}

	@Override
	public List<UserInfo> getUserList(UserInfo userInfo) {
		return userMapper.getUserList(userInfo);
	}

	@Override
	public UserInfo getUser(String user_id) {
		return userMapper.getUser(user_id);
	}
	
	@Override
	public int insertUser(UserInfo userInfo) {
		return userMapper.insertUser(userInfo);
	}

	@Override
	public int updateUser(UserInfo userInfo) {
		return userMapper.updateUser(userInfo);
	}

	@Override
	public int deleteUser(String user_id) {
		return userMapper.deleteUser(user_id);
	}
	
}
