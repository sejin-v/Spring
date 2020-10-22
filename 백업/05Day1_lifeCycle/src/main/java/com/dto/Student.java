package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private String name;
	private int age;
	public Student() {
		System.out.println("기본 생성자 호출 ");
	}
	public Student(String name, int age) {
		super();
		
		this.name = name;
		this.age = age;
	}
	
	public void aaa() {
		System.out.println("init-method.aaa");
		this.name="홍길동";
	}
	public String getName() {
		return this.name;
	}
	

	public void bbb() {
		System.out.println("destroy-method.bbb");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean.destroy");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet");
	}
	
}
