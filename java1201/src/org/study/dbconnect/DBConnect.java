package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
// DB연동 클래스 세팅 => static

	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";  // jdbc 드라이버 클래스파일 위치
		String url = "jdbc:oracle:thin:@localhost:1521:xe";     // 오라클 DB url
		String user = "system";    // 오라클 DB 계정
		String password = "1234";  // 오라클 DB 비밀번호
		
		// 1. JDBC 드라이버 로드  => Class.forname(driver);
		
		try {
			Class.forName(driver);
			System.out.println("JDBC Driver OK !");
			
			// 2. 오라클 DB 연동  => conn = DriverManager.getConnection(url, user, password);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect OK !");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("JDBC Driver Fail !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Connect Fail !");
		}
		
		
		
		
		return conn;
		
	}
	
}
