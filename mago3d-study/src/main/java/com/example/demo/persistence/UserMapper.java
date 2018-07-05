package com.example.demo.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.UserInfo;

@Mapper
public interface UserMapper {
	
	Long getUserTotalCount(UserInfo userInfo);
	
	List<UserInfo> getUserList(UserInfo userInfo);
	
	UserInfo getUser(String user_id);
	
	int insertUser(UserInfo userInfo);
	
	int updateUser(UserInfo userInfo);
	
	int deleteUser(String user_id);

}
