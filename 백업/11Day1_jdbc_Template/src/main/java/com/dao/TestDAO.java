package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {

	private JdbcTemplate jdbcTemplate;

	public TestDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<TestDTO> select() {
		List<TestDTO> list = jdbcTemplate.query("select * from test",
				new RowMapper<TestDTO>() {
					public TestDTO mapRow(ResultSet rs,int roNum)throws SQLException{
						TestDTO dto=new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						return dto;
					}
		});
		return list;
	}
	public List<TestDTO> selectByName(String name) {
		List<TestDTO> list = jdbcTemplate.query("select * from test where username=?",
				new RowMapper<TestDTO>() {
					public TestDTO mapRow(ResultSet rs,int roNum)throws SQLException{
						TestDTO dto=new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						return dto;
					}
		},name);//name가 ?로 들어간다 
		return list;
	}
	
	public void insert(int num,String name,String address) {
		jdbcTemplate.update("insert into test (num, username, address) values(?,?,?)",
		num,name,address);
	}
//
//	public void insert(int num,String name,String address) {
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		try {
////			con=DriverManager.getConnection(url, userid, passwd);
//			con=datasource.getConnection();
//			String sql="insert into test (num, username, address)"
//					+ " values(?,?,?)";
//			pstmt=con.prepareStatement(sql);
//			pstmt.setInt(1,num);
//			pstmt.setString(2, name);
//			pstmt.setString(3, address);
//			int n=pstmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if(pstmt!=null)pstmt.close();
//				if(con!=null)con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public void delete(int num) {
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		try {
////			con=DriverManager.getConnection(url, userid, passwd);
//			con=datasource.getConnection();
//			String sql="delete test where num=?";
//			pstmt=con.prepareStatement(sql);
//			pstmt.setInt(1,num);
//			int n=pstmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if(pstmt!=null)pstmt.close();
//				if(con!=null)con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	
//	public void updatae(int num,String name,String address) {
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		try {
////			con=DriverManager.getConnection(url, userid, passwd);
//			con=datasource.getConnection();
//			String sql="update test set username=?, address=? where num=?";
//			pstmt=con.prepareStatement(sql);
//			pstmt.setInt(3,num);
//			pstmt.setString(1, name);
//			pstmt.setString(2, address);
//			int n=pstmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if(pstmt!=null)pstmt.close();
//				if(con!=null)con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
