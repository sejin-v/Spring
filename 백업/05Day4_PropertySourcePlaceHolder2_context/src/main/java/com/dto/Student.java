package com.dto;

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
		System.out.println("인자 생성자 호출 ");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	


	
}
