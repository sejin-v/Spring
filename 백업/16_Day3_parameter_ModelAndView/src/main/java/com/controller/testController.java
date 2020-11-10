package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	@RequestMapping("/aaa")
	public String xxx() {
		System.out.println("이거 뽑아줘");
		return "main";
	}
	
	@RequestMapping("/bbb")
	public ModelAndView xxx2() {
		ModelAndView mav=new ModelAndView();//데이터 key,value저장,view페이지 정보저장
		mav.addObject("username","홍길동");
		mav.addObject("age",20);
		mav.setViewName("main2");//WEB-INF/view/main2.jsp
		return mav;//리턴 ModelAndView//main2.jsp로 데이터 전달
	}
	
	@RequestMapping("/getCookie2")
	public String xxx3() {
		return "main";
	}
}
