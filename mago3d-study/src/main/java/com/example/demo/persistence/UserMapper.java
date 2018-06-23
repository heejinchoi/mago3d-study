package com.example.demo.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.UserInfo;

@Repository
public interface UserMapper {
	
	Long getUserTotalCount(UserInfo userInfo);
	
	List<UserInfo> getUserList(UserInfo userInfo);
	
	

}
