package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String xxx() {
		System.out.println("xxx실행");
		return "loginForm";
	}
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main() {
		System.out.println("main실행");
		return "main";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String xxx2() {
		System.out.println("xxx2실행");
		return "login";
	}
}
