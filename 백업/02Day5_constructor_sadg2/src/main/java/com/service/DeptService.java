package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	private String driver;
	private String url;
	private String userid;
	private String pass;

	private DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "DeptService [dao=" + dao + "]";
	}


	
}
