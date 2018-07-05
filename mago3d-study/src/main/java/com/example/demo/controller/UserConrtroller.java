package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Country;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.CountryService;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/")
public class UserConrtroller {
	
	@Autowired
	UserService userService;
	@Autowired
	CountryService countryService;
	
	@RequestMapping("user-list.do")
	public String userList(UserInfo userInfo, Model model) {
		log.info("@@UserInfo = {}", userInfo);
		
		List<UserInfo> userList = new ArrayList<>();
		userList = userService.getUserList(userInfo);
		
		model.addAttribute("userList", userList);
		
		return "user-list";
	}
	
	@GetMapping("user-detail.do")
	public String userDetail(@RequestParam("user_id")String user_id, Model model) {
		UserInfo userInfo = new UserInfo();
		userInfo = userService.getUser(user_id);
		model.addAttribute("user", userInfo);
		
		return "user-detail";
	}
	
	@GetMapping("user-insert-form.do")
	public String insertUser(UserInfo userInfo, Country country, Model model) {
		log.info("@@UserInfo = {}", userInfo);
		
		List<UserInfo> userList = new ArrayList<>();
		userList = userService.getUserList(userInfo);
		List<Country> countryList = new ArrayList<>();
		countryList = countryService.getCountryList(country);
		
		model.addAttribute("userList", userList);
		model.addAttribute("countryList", countryList);
		
		return "user-insert";
	}
	
	@PostMapping
	@ResponseBody
	public Map<String, Object> ajaxInsertUser(UserInfo userInfo) {
		Map<String, Object> map = new HashMap<>();
		String result = "success";
		try {
			userService.insertUser(userInfo);
			map.put("msg", result);
			log.info("map={}" + map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/* 커스텀 태그를 사용하지 않는 방식 */
	@GetMapping("user-update-form-old.do")
	public String updateUserForm(@RequestParam("user_id") String user_id, @ModelAttribute("userList")UserInfo userInfo, Model model) {
		log.info("@@@@@@@@@@ user_id = " + user_id);
		userInfo  = userService.getUser(user_id);
		log.info("@@@ userInfo = {}" + userInfo);
		
		model.addAttribute("user", userInfo);
		model.addAttribute("user_id", userInfo.getUser_id());
		
		return "user-update-old";
	}
	
	@PostMapping("user-update-old.do")
	public String updateUser(HttpServletRequest req, @RequestParam("user_id") String user_id, Model model) {
		UserInfo userInfo = new UserInfo();
		String password = req.getParameter("password");
		String salt = req.getParameter("salt");
		String name = req.getParameter("name");
		userInfo.setUser_id(user_id);
		userInfo.setPassword(password);
		userInfo.setSalt(salt);
		userInfo.setName(name);
		
		userService.updateUser(userInfo);
		log.info("@@@@ userInfo = {}" + userInfo);
		userInfo = userService.getUser(user_id);
		
		model.addAttribute("user", userInfo);
		
		return "redirect:user-list.do";
	}
	
	/* 커스텀 태그를 사용하는 방식 */

	@RequestMapping("delete-user.do")
	public String deleteUser(@RequestParam("user_id") String user_id, UserInfo userInfo) {
		userService.deleteUser(user_id);
		log.info("@@UserInfo = {}", userInfo);
		
		return "redirect:/user/user-list.do";
	}

}
