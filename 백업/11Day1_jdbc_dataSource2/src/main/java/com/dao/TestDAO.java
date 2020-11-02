package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {

	// 드라이버 로딩, 커넥션, pstmt 실행

//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//	String userid = "scott";
//	String passwd = "tiger";
	@Autowired
	DataSource datasource;
	public TestDAO() {
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			con = DriverManager.getConnection(url, userid, passwd);
			con=datasource.getConnection();
			String sql = "select * from test";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int n = rs.getInt("num");
				String n2 = rs.getString("username");
				String n3 = rs.getString("address");
				TestDTO dto = new TestDTO(n, n2, n3);
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return list;
	}

	public void insert(int num,String name,String address) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
//			con=DriverManager.getConnection(url, userid, passwd);
			con=datasource.getConnection();
			String sql="insert into test (num, username, address)"
					+ " values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			int n=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int num) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
//			con=DriverManager.getConnection(url, userid, passwd);
			con=datasource.getConnection();
			String sql="delete test where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,num);
			int n=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void updatae(int num,String name,String address) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
//			con=DriverManager.getConnection(url, userid, passwd);
			con=datasource.getConnection();
			String sql="update test set username=?, address=? where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(3,num);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			int n=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
