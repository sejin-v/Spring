package com.dto;

public class Student {
	
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return name+"\t"+age;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}
	
	
}