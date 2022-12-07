package org.study.exceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	// 리턴타입 : Connection (인터페이스)  => 오라클DB에 연결
	public static Connection getConnection() {
		
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);    // jdbc드라이버 로드시 에러에 대한 try/catch 필요
			System.out.println("Driver Ok");
			
			conn = DriverManager.getConnection(url, user, password);  // 연결시 에러에 대한 catch문 생성 필요
			System.out.println("Connection Success !");   // 자바와 오라클 연결이 최종적으로 성공 !
			
		} catch (ClassNotFoundException e) {    // 클래스 로드 에러에 대한 예외타입
			e.printStackTrace();
			System.out.println("Driver Null");
			
		} catch (SQLException e) {       // DB연결 에러에 대한 예외타입
			e.printStackTrace();
			System.out.println("Connection Fail !");
		}
		
		return conn;
	}
}
