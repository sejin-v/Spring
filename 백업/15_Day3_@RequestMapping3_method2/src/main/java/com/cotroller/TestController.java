package com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/kkk")
	public String xxx() {
		System.out.println("TestController.kkk호출");
		return "login";
	}
	
	
	
}
