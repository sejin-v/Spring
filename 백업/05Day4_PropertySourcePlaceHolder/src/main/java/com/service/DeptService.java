package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	
	private String name;
	private int age;
	private String url;
	private String db;
	
	@Autowired
	private DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	@Override
	public String toString() {
		return "DeptService [name=" + name + ", age=" + age + ", url=" + url + ", db=" + db + ", dao=" + dao + "]";
	}

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	
	
	
}
