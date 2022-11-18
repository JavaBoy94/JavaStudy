package org.study.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		
		Connection conn = null;   // DB연결
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		// 1. jdbc 드라이버 로드  => 예외처리 필요 (try~catch)
		try {
			Class.forName(driver);
			System.out.println("Driver Load is Success !");
			
			// 2. 오라클 DB 연결  => 예외처리 필요 (catch만 하나 추가)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Success !");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver Load is Fail !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Connect Fail !");
		}

		
		return conn;
	}
	
}
