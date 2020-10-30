package com.dto;

public class Cat {
	private String catName;
	private int catAge;
	
	public void setCatName(String catName) {
		this.catName = catName;
	
	}
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	public String getCatName() {
		return catName;
	}
	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
	
}
