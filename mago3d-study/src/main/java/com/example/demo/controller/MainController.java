package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study/")
public class MainController {
	
	@RequestMapping("main")
	public String home() {
		return "index";
	}

}
