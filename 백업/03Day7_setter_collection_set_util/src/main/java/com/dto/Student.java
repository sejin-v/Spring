package com.dto;

import java.util.List;
import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Set<Cat> setCat;

	
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
		return "Student \n [name=" + name + ", age=" + age + ",\n cat=" + setCat + "]";
	}

	public Set<Cat> getSetCat() {
		return setCat;
	}

	public void setSetCat(Set<Cat> setCat) {
		this.setCat = setCat;
	}



	
}