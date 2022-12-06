package org.study.exceptionEx;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMain {

	public static void main(String[] args) {
		// 오라클 db연결 실행 (jdbc드라이버 로드 + 오라클DB 연결)
		DBConnect.getConnection();
		
	}
}
