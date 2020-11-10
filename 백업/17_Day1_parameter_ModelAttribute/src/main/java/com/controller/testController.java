package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class testController {

	@ModelAttribute("xxx")
	public ArrayList<String> getList() {
		System.out.println("getList()====");
		ArrayList<String> list = new ArrayList<String>();
		list.add("박세진");
		list.add("박세진");
		list.add("박세진");
		list.add("박세진");
		return list;
	}

	@RequestMapping(value = "/aaa", method=RequestMethod.GET)
	public String xxx3(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("aaa 추가요청 작업 ");
		return "main";
	}
	
	@RequestMapping(value = "/bbb", method=RequestMethod.GET)
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("bbb 추가요청 작업 ");
		return "main2";
	}
}
