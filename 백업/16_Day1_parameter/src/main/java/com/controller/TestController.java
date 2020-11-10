package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm() 실행");
		return "loginForm";
	}

	
	@RequestMapping(value="/login2",method=RequestMethod.POST)
	public ModelAndView login2(@RequestParam("userid") String id,
			@RequestParam("passwd") String pw) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("id",id);
		mav.addObject("pw",pw);
		mav.setViewName("logined");
		System.out.println("@RequestParam apssing===="+id +"\t"+ pw);
		return mav;
	}
	

	@RequestMapping(value="/login3")
	public String login3(@RequestParam String userid,@RequestParam String passwd) {
		System.out.println("@RequestParam String id, pw "+userid +"\t"+ passwd);
		return "login";
	}
	
	@RequestMapping(value="/login4", method=RequestMethod.POST)
	public String login4(String userid,String passwd) {//form과 동일하면 자동 파싱
		System.out.println("4.String id, pw "+userid +"\t"+ passwd);
		return "login";
	}
	
//	@RequestMapping(value="/login5")//안됨 왜안됨?
//	public String login5(@RequestParam(required =false,defaultValue="홍길동")
//	String userid,String passwd) {//form과 동일하면 자동 파싱
//		System.out.println("5.String id, pw "+userid +"\t"+ passwd);
//		return "login";
//	}
	
	@RequestMapping(value="/login6",method=RequestMethod.POST)
	public String login6(@RequestParam Map<String,String> m) {
		System.out.println("6.String id, pw "+m );
		return "login";
	}
	
	@RequestMapping(value="/login7",method=RequestMethod.POST)
	public String login7(HttpServletRequest request) {
		String id=request.getParameter("userid"); 
		String pw=request.getParameter("passwd");
		System.out.println("7.HttpServletRequest===="+id +"\t"+ pw);
		return "login";
	}
	
}
