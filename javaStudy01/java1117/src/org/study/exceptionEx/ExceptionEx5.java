package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		// 오라클(jdbc)드라이버 클래스 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");   // OracleDriver.class의 경로
			System.out.println("oracle Driver Ok");
		} catch (ClassNotFoundException e) {   // 드라이버 클래스를 찾을 수 없는 경우
			e.printStackTrace();
			System.out.println("oracle Driver Null");
		}

	
		
		System.out.println("프로그램 정상실행");      
		
		
		
	}
}
