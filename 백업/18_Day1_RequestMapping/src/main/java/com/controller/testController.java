package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa 호출");
		return "main";
	}

	@RequestMapping(value = { "/bbb", "/ccc" }, method = RequestMethod.GET)
	public String aaa2() {
		System.out.println("aaa2 호출");
		return "main";
	}
 
	@RequestMapping(value = "/ccc*", method = RequestMethod.GET)
	public String ccc() {
		System.out.println("ccc 호출");
		return "main";
	}

	@RequestMapping(value = "/ddd/*", method = RequestMethod.GET)
	public String ddd() {
		System.out.println("ddd 호출");
		return "main";
	}

	@RequestMapping(value="/eee/**", method = RequestMethod.GET)
	public String eee() {
		System.out.println("eee 호출");
		return "main";
	}
	
	@RequestMapping(value="/fff/**/ggg", method = RequestMethod.GET)
	public String fff() {
		System.out.println("fff 호출");
		return "main";
	}
	
	
	@RequestMapping(value="/hhh/{userid}/xxx/{passwd}", method = RequestMethod.GET)
	public String iii() {
		System.out.println("hhh 호출");
		return "main";
	}
	
}
