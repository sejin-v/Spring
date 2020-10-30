package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//공통로직부분 선언,핵심로직 어느 함수에서 실행할지 등록,실행코드 구현
public class StudentAfterReturningAspect {
	
	@AfterReturning(pointcut="execution(* sayEcho(..))",returning="retVal")
	public void sayEchoAfterReturning(JoinPoint point,Object retVal) {
		System.out.println(point.getSignature());
		System.out.println("sayEchoAfterReturning>>"+retVal);
	}
		
	}
