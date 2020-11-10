package com.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class testController {

	
	@RequestMapping(value = "/aaa", method=RequestMethod.GET)
	public String xxx3(Model m) {//request 대신 model객체 사용
		m.addAttribute("username","홍길동");
		return "main";
	}
	
	@RequestMapping(value = "/bbb", method=RequestMethod.GET)
	public String bbb(Map<String,Object> map) {
		map.put("address","seoul");
		map.put("username","jin");
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		map.put("list",list);
		return "main2";
	}
}
