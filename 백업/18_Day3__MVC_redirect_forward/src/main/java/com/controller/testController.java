package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출");
		return "main";
	}
	
	//redirect
	@RequestMapping(value="/redirect",method = RequestMethod.GET)
	public String redirect(Model m) {
		System.out.println("redirect 호출");
		m.addAttribute("uesrid","Jin");
		return "redirect:main";//main.jsp가 아닌 주소 /main 을 찾가간다
		//url로 데이터 넘기기는 가능 
		//request.getParameter로 뽑을 수는 있다.
		//setAttribute를 사용할수 없다.
	}
	
	
	
//	//redirect
//		@RequestMapping(value="/redirect2",method = RequestMethod.GET)
//		public String redirect(HttpServletRequest request) {
//			System.out.println("redirect 호출");
//			request.setAttribute("uesrid","Jin");
//			return "redirect:main";//main.jsp가 아닌 주소 /main 을 찾가간다
//		}
	
	
}
