package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {
	
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

	@PostConstruct
	public void xxx(){
		System.out.println("초기화 메서드");
	}
	@PreDestroy
	public void yyy() {
		// TODO Auto-generated method stub
		System.out.println("자원반납 메서드");
	}
	
}
