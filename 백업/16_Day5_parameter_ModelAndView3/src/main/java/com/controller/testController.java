package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class testController {

	@RequestMapping(value="/aaa",method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {//list객체 생성
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav=new ModelAndView();
		mav.addObject("key",list);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/bbb",method = RequestMethod.GET)
	public ModelAndView xxx3(@ModelAttribute("xxx") ArrayList<String> list) {//list객체 생성
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("main2");
		return mav;
	}
	
	@RequestMapping(value="/ccc",method = RequestMethod.GET)
	public String ccc(ArrayList<String> list) {//key값이 지정X=>stringList 로 자동 저장된다
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		return "main3";
	}
	
	@RequestMapping(value="/ddd",method = RequestMethod.GET)
	public String ddd(HttpServletRequest request) {
		request.setAttribute("userid", "abcd");
		return "main4";
	}
	
	@RequestMapping(value="/eee",method = RequestMethod.GET)
	public String eee(Login dto) {//key값이 지정X=>login 로 자동 저장된다
		dto.setUserid("abcd");
		dto.setPasswd("1234");
		return "main5";
	}
	
	@RequestMapping(value="/fff",method = RequestMethod.GET)
	public ModelAndView fff(@ModelAttribute("aaa") Map<String, String> map) {//key값이 지정X=>stringList 로 자동 저장된다
		map.put("bb", "111");
		map.put("ccc", "111");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("main6");
		return mav;
	}
}
