package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("#{stu.name}")
	private String name;
	
	@Value("#{stu.age}")
	private int age;


	public Student() {
		super();
		System.out.println("기본생성자 호출 ------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age +  "]";
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
	
}
