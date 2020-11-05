package com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value="/kkk")
	public String kkk() {
		System.out.println("HelloController./kkk요청");
		return "login";
	}
}
