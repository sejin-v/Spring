package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

@Service
public class TwoService {
		public void two() {
			System.out.println("twoService");
		}
}
