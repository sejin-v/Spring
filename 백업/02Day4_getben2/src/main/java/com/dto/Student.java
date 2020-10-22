package com.dto;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		super();
		System.out.println("stu 기본생성자 호출");
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		System.out.println("stu 인자있는 생성자");
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
