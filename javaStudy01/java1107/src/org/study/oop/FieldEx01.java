package org.study.oop;

import java.util.Date;

public class FieldEx01 {

	// 클래스의 필드로 사용할 수 있는 것들
	// 1. 인스턴스 멤버
	public int num;       // 기본자료형
	public String name;   // 문자열
	public int[] arr1;    // 배열
	public Date day;      // 라이브러리 => import 필요
	public Car car;       // 클래스
	
	// 2. 클래스 멤버
	public static final String MEMBERNAME="JAVA";    // final 상수
	
	public static void method() {                    // 클래스 메소드
		System.out.println(MEMBERNAME);
	}
	
}
