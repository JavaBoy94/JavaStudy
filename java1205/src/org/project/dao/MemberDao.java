package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	Connection conn = null;
	PreparedStatement pstm = null;
	String query = "";
	ResultSet rs = null;

//	1. insert --------------------------------------------------------------

	public void Insert(String userid, String userpw, int age, String email) {

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1(userid,userpw,age,email) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			pstm.setInt(3, age);
			pstm.setString(4, email);

			pstm.executeUpdate();

			System.out.println("회원가입 성공 !");
			System.out.println();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

//	2 - 1 select list ------------------------------------------------------------

	public ArrayList<MemberDto> selectList() {
		ArrayList<MemberDto> lists = new ArrayList<>();

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1 order by userid";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();
			System.out.println();

			if (rs != null) {
				System.out.println("USERID\tUSERPW\tAGE\tEMAIL");
				System.out.println("--------------------------------------");

				while (rs.next()) {
					String id = rs.getString(1);
					String pw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					lists.add(new MemberDto(id, pw, age, email));
				}

			} else {
				System.out.println("회원목록이 없습니다 !");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
	}

// 2 - 2 select user ----------------------------------------------------------

	public ArrayList<MemberDto> selectUser(String userid) {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1 where userid=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);

			rs = pstm.executeQuery();
			System.out.println();

			if (rs != null) {
				System.out.println("USERID\tUSERPW\tAGE\tEMAIL");
				System.out.println("--------------------------------------");

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
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lists;
	}

// 3. update ----------------------------------------------------------------

	public void update(String userid, String userpw, int age, String email) {

		try {
			conn = DBConnect.getConnection();
			query = "update member1 set userpw=?,age=?,email=? where userid=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userpw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userid);

			pstm.executeUpdate();

			System.out.println("회원수정 완료 !");
			System.out.println();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

//	4. delete -------------------------------------------------------------

	public void delete(String userid) {

		try {
			conn = DBConnect.getConnection();
			query = "delete from member1 where userid=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userid);

			pstm.executeUpdate();

			System.out.println("회원탈퇴 완료 !");
			System.out.println();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리문 오류 !");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	public ArrayList<MemberDto> selectAge(int ageStart, int ageEnd) {
	public ArrayList<MemberDto> selectAge() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		try {
			conn = DBConnect.getConnection();
//			query = "select * from member1 where age>=? and age<?";
			query = "select * from member1 where age between 30 and 39";
			pstm = conn.prepareStatement(query);

//			pstm.setInt(1, ageStart);
//			pstm.setInt(2, ageEnd);

			rs = pstm.executeQuery();
			System.out.println();

			if (rs != null) {
				System.out.println("USERID\tUSERPW\tAGE\tEMAIL");
				System.out.println("-----------------------------------------");
				
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
		}

		return lists;
	}
}
