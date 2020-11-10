package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	@RequestMapping(value="/aaa")
	public String xxx() {
		if(true)throw new ArithmeticException("error 발생1");
		return "main";
	}
	
	@RequestMapping(value="/bbb")
	public String bbb() {
		if(true)throw new NullPointerException("error 발생2");
		return "main";
	}
	
//	@ExceptionHandler({ Exception.class})
//	public String errorPage() {
//		return "error";
//	}
	
}
