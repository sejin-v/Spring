package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
@Service("service")
public class DeptService {

	@Autowired
	DeptDAO dao;
	
public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

public DeptDAO getdao() {
	return dao;
}
}
