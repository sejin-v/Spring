package com.dto;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private List<Cat> listCat;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student \n [name=" + name + ", age=" + age + ",\n cat=" + listCat + "]";
	}

	public List<Cat> getListCat() {
		return listCat;
	}

	public void setListCat(List<Cat> listCat) {
		this.listCat = listCat;
	}


	
}