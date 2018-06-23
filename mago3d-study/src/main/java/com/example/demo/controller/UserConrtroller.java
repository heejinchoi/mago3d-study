package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/")
public class UserConrtroller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("user-list")
	public String userList(UserInfo userInfo, Model model) {
		log.info("@@UserInfo = {}", userInfo);
		
		List<UserInfo> userList = new ArrayList<>();
		userList = userService.getUserList(userInfo);
		
		model.addAttribute("userList", userList);
		
		return "user-list";
	}

}
