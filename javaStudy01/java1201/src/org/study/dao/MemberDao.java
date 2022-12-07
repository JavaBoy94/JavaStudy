package org.study.dao;

import java.awt.color.CMMException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {
// DB에 연결하여 SQL문 실행하는 클래스
// CRUD에 해당되는 sql문을 실행하는 메소드 세팅 (insert, select, update, delete)
	public MemberDao() {
		System.out.println("기본생성자");
	}
	
	// 1. insert(회원가입)  => 반환타입 : int (1: 성공, 0: 실패) ---------------------
	
	public int insert(String userId, String userPw, int age) {
		int result = 0;
		System.out.println("ID : "+userId+" PW : "+userPw+" age : "+age);
		System.out.println();
		
		Connection conn = null;          // DB연동
		PreparedStatement pstm = null;   // SQL 처리
		String query = "";               // 쿼리문  => pstm에 담는 용도
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member(userid,userpw,age) values(?,?,?)";
			
			pstm = conn.prepareStatement(query);  // sql 처리
			// 쿼리문에 입력할 값을 매개변수로 입력
			pstm.setString(1, userId);  // values의 1번째 ?에 userId 입력
			pstm.setString(2, userPw);  // values의 2번째 ?에 userPw 입력
			pstm.setInt(3, age);		// values의 3번째 ?에 age 입력
			
			// sql 실행  excuteUpdate => 반환타입 : int, slq처리 결과(1: 성공, 0: 실패)
			result = pstm.executeUpdate();  // 결과값 반환 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {  // 연결 종료
					if (conn!=null) conn.close();
					if (pstm!=null) pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		return result;   // insert 메소드의 리턴값 (1 or 0)
		
	}
	
	// 2. select(회원조회)  => 객체(Dto), null ------------------------------------
	
//	public static void select(String userId) {
//		Connection conn = null;
//		PreparedStatement pstm = null;
//		String query = "select * from member where userid=?";
//		ResultSet rs = null;
//		
//		try {
//			conn = DBConnect.getConnection();
//			pstm = conn.prepareStatement(query);
//			pstm.setString(1, userId);
//			
//			rs = pstm.executeQuery();
//			System.out.println("ID\t"+"PW\t"+"AGE");
//			System.out.println("--------------------");
//			while (rs.next()) {
//				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//				try {
//					if (conn!=null)
//						conn.close();
//					if (pstm!=null)
//						pstm.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}
	
	public ArrayList<MemberDto> select() {  // 반환타입이 ArrayList객체인 메소드 생성
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "select * from member";
		ResultSet rs = null;   // pstm의 sql처리결과를 담을 객체
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while (rs.next()) {
					String userId = rs.getString(1);   // userId
					String userPw = rs.getString(2);   // userPw
					int age = rs.getInt(3);            // age
					lists.add(new MemberDto(userId, userPw, age));

				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
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
	

	// 3. update(회원수정)  => 반환타입 : int (1: 성공, 0: 실패)  ----------------------
	
	public int update(String userId, String userPw, int age) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "update member set userpw=?,age=? where userid=?";
		
		try {
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	
	// 4. delete(회원탈퇴)  => 반환타입 : int (1: 성공, 0: 실패) -----------------------
	
	public int delete(String userId) {
		int result = 0;
		System.out.println("탈퇴할 ID : "+userId);
		System.out.println();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete from member where userid=?";
			
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
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
		
		
		return result;
		
	}
	
	
	
}
