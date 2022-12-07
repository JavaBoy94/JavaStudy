package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB연동
public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";    // 오라클 기본 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe";   // 오라클 기본 DB url
		String user = "system";    // 오라클 id
		String password = "1234";  // 오라클 pw
		
		// 1. driver 클래스파일 찾기 (JDBC)
		try {
			Class.forName(driver);
			System.out.println("Driver OK !");
			
			// 2. DB연결 (xe)=> 오라클
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공 !");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다 !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패!");
		}
		
//		System.out.println(conn);
		
		if (conn!=null) {
			System.out.println("오라클 연동 성공");
		} else {
			System.out.println("오라클 연동 실패");
		}

		return conn;
		
	}
}
