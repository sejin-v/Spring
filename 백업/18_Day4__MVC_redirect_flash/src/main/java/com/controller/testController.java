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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class testController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출");
		return "main";
	}
	
	//redirect-flash >>>xml을 추가 해줘야한다
	@RequestMapping(value="/redirect",method = RequestMethod.GET)
	public String redirect(RedirectAttributes m) {
		System.out.println("redirect 호출");
		m.addFlashAttribute("userid","Jin");
		return "redirect:main";//main.jsp가 아닌 주소 /main 을 찾가간다
	}
	
	//redirect-flash >>>xml을 추가 해줘야한다
		@RequestMapping(value="/redirect2",method = RequestMethod.GET)
		public String redirect2(RedirectAttributes m) {
			System.out.println("redirect2 호출");
			ModelAndView mav=new ModelAndView();
			mav.addObject("userid","JJJ");
			m.addAttribute("userid",mav);
			return "redirect:main";//main.jsp가 아닌 주소 /main 을 찾가간다
		}
}
