package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Map<String,Cat> mapCat;
	
	Properties phones;
	
	
	public Properties getPhones() {
		return phones;
	}

	public void setPhones(Properties phones) {
		this.phones = phones;
	}

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
		return "Student [name=" + name + ", age=" + age + ", mapCat=" + mapCat + ", phones=" + phones + "]";
	}

	public Map<String, Cat> getMapCat() {
		return mapCat;
	}

	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}




	
}