package com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/main")
	public String kkk() {
		return "main";
	}
	
	@RequestMapping(value="/member")
	public String kkk5() {
		return "member";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String kkk2() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView kkk3( @RequestParam("userid") String id) {
		System.out.println(id);
		ModelAndView mav= new ModelAndView();
		mav.addObject("id",id);
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String kkk4() {
		return "logout";
	}
	
}
