package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAspect {

		@Around("execution(* sayEcho(..))")
		public Object sayEchoAround(ProceedingJoinPoint pjp)throws Throwable{
			System.out.println("before");
			Object retVal =pjp.proceed();//핵심로직 sayEcho실행 리턴값 받아옴
			System.out.println("after");
			System.out.println("retVal:"+retVal);
			return retVal;
					
		}
}
