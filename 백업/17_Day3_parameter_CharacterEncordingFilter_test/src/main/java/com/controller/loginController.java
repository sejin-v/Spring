package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.loginDTO;

@Controller
public class loginController {
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String aa() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String bb(loginDTO dto,HttpSession session) {
		loginDTO mdto=(loginDTO)session.getAttribute("member");
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String cc(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
	
	@RequestMapping(value="/member",method = RequestMethod.GET)
	public String cc() {
		return "memberForm";
	}
	
	@RequestMapping(value="/member",method = RequestMethod.POST)
	public String vv(loginDTO dto,HttpSession session) {
		session.setAttribute("member", dto);
		return "redirect:login";
	}
}
