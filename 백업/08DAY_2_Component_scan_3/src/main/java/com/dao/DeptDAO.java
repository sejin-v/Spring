package com.dao;

import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;
@Repository
public class DeptDAO {
	
	public DeptDTO getinfo(DeptDTO dto){
		return new DeptDTO(100,"관리","서울");
	}
}
