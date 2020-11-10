package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.loginDTO;

@Controller
public class loginController {
	
	@RequestMapping(value="/aaa",method = RequestMethod.GET)
	public String xxx3() {
		return "main";
	}
	
	@RequestMapping(value="/bbb",method = RequestMethod.GET)
	public ModelAndView bbb() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("username","홍길동");
		mav.setViewName("main2");
		return mav;
	}
	
	@RequestMapping(value="/ccc",method = RequestMethod.GET)
	public loginDTO ccc() {//리턴 페이지가 없을때는 주소와 같은 jsp를 찾아간다
		loginDTO d=new loginDTO();
		d.setPasswd("111");
		d.setUserid("jin");
		return d;
	}
	
	@RequestMapping(value="/ddd",method = RequestMethod.GET)
	@ModelAttribute("xxx")//xxx에 담아서 주겠다
	public loginDTO ddd() {
		loginDTO d=new loginDTO();
		d.setPasswd("111");
		d.setUserid("jin");
		return d;
	}
	
	@RequestMapping(value="/eee",method = RequestMethod.GET)
	public ArrayList<String> eee() {
		ArrayList<String> list =new ArrayList<String>();
		list.add("홍길동");
		list.add("홍길동");
		return list;//키는 stringList
	}
	
	@RequestMapping(value="/fff",method = RequestMethod.GET)
	public void fff() {
		System.out.println("fff");
	}
		
}
