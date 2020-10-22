package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Map<String,Cat> mapCat;

	
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
		return "Student \n [name=" + name + ", age=" + age + ",\n cat=" + mapCat + "]";
	}

	public Map<String, Cat> getMapCat() {
		return mapCat;
	}

	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}




	
}