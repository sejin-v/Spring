package com.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int age;

	private Cat cat;

	public Student() {
		super();
		System.out.println("기본생성자 호출 ------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}

	public Student(Cat cat) {
		System.out.println("====생성자 호출 ====");
		this.cat = cat;
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

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
}
