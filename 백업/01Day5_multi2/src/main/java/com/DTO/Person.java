package com.DTO;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		System.out.println("인자없는 기본 생성자 person");
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		System.out.println("인자있는 생성자person");
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
