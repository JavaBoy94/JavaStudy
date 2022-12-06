package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	// 1. insert  ----------------------------------------------------
	
	public int insert(String userId, String userPw, int age, String email) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm =null;
		String query = "insert into member2(userid,userpw,age,email) values(?,?,?,?)";
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);
			
			result = pstm.executeUpdate();
			
			System.out.println("회원가입 성공 !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return result;		
	}
	
	// 2 - 1) selectAll(전체회원 조회) --------------------------------------------
	
	public ArrayList<MemberDto> selectAll() {
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "select * from member2";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while (rs.next()) {
					String id = rs.getString(1);
					String pw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					lists.add(new MemberDto(id, pw, age, email));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		return lists;
		
	}
	
	// 2 - 2) select (특정회원 조회) ----------------------------------------------
	public ArrayList<MemberDto> select(String userid) {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "select * from member2 where userid=?";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userid);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while (rs.next()) {
					String id = rs.getString(1);
					String pw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					lists.add(new MemberDto(id, pw, age, email));
				} 
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null) 
						pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return lists;
		
	}
	
	// 3. update  ----------------------------------------------------
	
	public int update(String userid, String userpw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "update member2 set userpw=?,age=?,email=? where userid=? ";
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userpw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userid);
			
			result = pstm.executeUpdate();
			
			System.out.println("회원수정 완료 !");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		return 0;

	}
	
	// 4. delete  ----------------------------------------------------
	
	public void delete (String userid, String userpw) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "delete from member2 where userid=?";
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userid);
			
			pstm.executeUpdate();
			
			System.out.println("회원탈퇴 완료 !");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
	
}
