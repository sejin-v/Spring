package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//공통로직부분 선언,핵심로직 어느 함수에서 실행할지 등록,실행코드 구현
public class StudentBeforeAspect {
	@Pointcut("execution(* call*(..))")
	//pointcut는 xxx함수가 언제 실행될지 정해주는 역할
	//모든리턴타입 call이란이름이 들어간 모든함수 
	public void xxx() {}//공통로직에 구현된함수
	
	@Before("xxx()")//jointpoint 공통로직이 실행될 시점 지정
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통로직====="+point);
		System.out.println("공통로직====="+point.getSignature().getName());
		System.out.println("공통로직=====cakkEchoBefore");
	}
}
