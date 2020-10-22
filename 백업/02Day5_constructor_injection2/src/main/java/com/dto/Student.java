package com.dto;

public class Student {
	
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		System.out.println("2개");
		this.name = name;
		this.age = age;
	}
	
	
	public Student(int age) {
		super();
		System.out.println("age");
		this.age = age;
	}


	public Student(String name) {
		super();
		System.out.println("name");
		this.name = name;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getInfo() {
		return name+"\t"+age;
	}

	
}