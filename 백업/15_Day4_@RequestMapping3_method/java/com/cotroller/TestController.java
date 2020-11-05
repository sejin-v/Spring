package com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/")
	public String xxx() {
		System.out.println("main호출");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params="aaa=bbb")
	public String kkk() {
		System.out.println("A호출");
		return "login";
	}
	
	@RequestMapping(value="/kkk", params="aaa=ccc")
	public String kkk2() {
		System.out.println("B호출");
		return "login";
	}
	
	@RequestMapping(value="/kkk", params="xxx")
	public String kkk3() {
		System.out.println("C호출");
		return "login";
	}
	
}
