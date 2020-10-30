package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

@Service("xxx")
public class OneService {
	
	public void one() {
		System.out.println("OneService");
	}
	}
