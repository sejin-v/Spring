package com.dto;

public class Person {


	private String name;
	private int age;
	
	public Person() {
		super();
		System.out.println("person 기본생성자 호출");
	}
	public Person(String name, int age) {
		super();
		System.out.println("person 인자있는 생성자");
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
