package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		Student st = ctx.getBean("stu",Student.class);
	
		System.out.println(st);
	}

}
