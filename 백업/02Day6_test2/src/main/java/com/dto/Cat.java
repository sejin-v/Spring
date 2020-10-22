package com.dto;

public class Cat {

	private String catName;

	public Cat(String catName) {
		super();
		this.catName = catName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + "]";
	}
	
	
}
