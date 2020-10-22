package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptDAO {
	
	public DeptDAO() {
		System.out.println("기본생성자 호출 dao");
	}
	public List<String> list(){
		return Arrays.asList("홍길동","이순신","유관순");
	}
}
