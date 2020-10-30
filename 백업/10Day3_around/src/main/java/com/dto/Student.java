package com.dto;

public class Student {
	
	public String sayEcho() {
		System.out.println("sayEcho 호출");
		
		for(int i=0;i<100;i++) {
			i +=i;
		}
		long curTime = System.currentTimeMillis();
	      System.out.println(curTime);
		return "Hello";
	}
	
	public String callEcho() {
		System.out.println("callEcho 호춯");
		return "World";
	}
}
