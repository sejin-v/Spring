package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class testController {

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String aa() {
		System.out.println("로그인 폼");
		return "loginForm";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String bb(Login dto,HttpSession session) {
		System.out.println("로그인 post");
		System.out.println("session 설정"+dto);
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String cc(HttpSession session) {
		System.out.println("session 끄기");
		session.invalidate();
		return "redirect:login";//로그인폼으로 다시이동 
		//mapping주소 로그인으로 다시 접근
		//response.sendredirect 효과
	}
}
