package com.dto;

import org.hibernate.loader.custom.Return;

public class Student {

	public String sayEcho() {
		System.out.println("sayEcho호ㅊ출");
		int n=10/0;//ArithmeticException발생 하게 만들어놈
		return "Hello";
	}
	public String callEcho() {
		System.out.println("callEcho호출");
		return "callEcho호출";
	}
	
}	
