package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//공통로직부분 선언,핵심로직 어느 함수에서 실행할지 등록,실행코드 구현
public class StudentBeforeAspect {
	
	
	@Before("execution(* getInfo(..))")
	public void sayEchoBefore() {
		System.out.println("getInfoBefore");
	}
	
	@Before("execution(* mesg(..))")
	public void mesgBefore(){
		System.out.println("beforeMesg");
	}
}
