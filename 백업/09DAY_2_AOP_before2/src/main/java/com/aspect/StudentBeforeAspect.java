package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//공통로직부분 선언,핵심로직 어느 함수에서 실행할지 등록,실행코드 구현
public class StudentBeforeAspect {
	
	@Pointcut("execution(* call*(..))")
	public void xxx() {}
	
	@Before("xxx()")
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통로직===="+point);
		System.out.println("공통로직===="+point.getSignature().getName());
		System.out.println("공통로직==== call");
	}
	@Before("execution(* sayEcho(..))")
	public void sayEchoBefore() {
		System.out.println("sayEchoBefore");
	}
}
