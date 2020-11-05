package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate template;//SqlSession
	
	public List<DeptDTO> selectAll(){
		return template.selectList("DeptMapper.selectAll");
	}
	
	public void tx()throws Exception {
//		template.delete("DeptMapper.deptDelete", 50);
		DeptDTO dto=new DeptDTO(60,"6666","6666");
		template.insert("DetptMapper.deptInsert",dto);
	}
	
	
}
