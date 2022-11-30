package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.study.dbconnect.DBConnect;

public class MemberDao {
	
	public MemberDao() {
		System.out.println("Dao");
	}

	public int insert(String userId, String userPw, int age) {
		System.out.print("아이디 : "+userId);
		System.out.print(", 비밀번호  : "+userPw);
		System.out.print(", 나이 : "+age);
		System.out.println();

		int result = 0;
		
		Connection conn = null; // DB연동
		PreparedStatement pstm = null;  // SQL 처리  (sql문을 담아 DB에서 실행하기 위한 객체)
		String query = "";   // 쿼리문
		
		try {
			// 1. DB연동  => DBConnect 클래스 객체 사용
			// Connect null => 연결실패
			conn = DBConnect.getConnection();
			query = "insert into member(userId, userPw, age) values(?,?,?)";
			
			// 2. SQL 실행
			// 1) DB연동하여 해당 쿼리문 준비?
			pstm = conn.prepareStatement(query);  // 쿼리문을 바로 넣을 순 없음 => conn의 prepareStatement 메소드 필요
			// 2) 쿼리문의 들어갈 필드값 받기  => query의 ?위치에 해당 순서대로 읽음
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);;
			// 3) 실행, 결과반환  => 반환타입 : int => return값(result)에 결과받기
			result = pstm.executeUpdate();   //  0 : 실패, 1 : 성공
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 성공적으로 연결하여 실행 완료되면 DB, SQL 종료
				try {
					if (conn != null) conn.close();
					if (pstm != null) pstm.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
		return result;  
	}
}
