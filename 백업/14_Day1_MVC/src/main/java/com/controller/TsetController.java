package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TsetController {

	@RequestMapping("/kkk")
	public String xxx() {
			System.out.println("kkk");
			return "/WEB-INF/views/main.jsp";
	}
	@RequestMapping("/yyy")
	public String xxx2() {
			System.out.println("yyy");
			return "/WEB-INF/views/main.jsp";
	}
	
}
