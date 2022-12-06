package org.study.oop;

public class ClassBasic {

	// 클래스 멤버 => static 사용 (프로그램이 종료되도 메모리에 남아있음) 변하지않는 값을 사용할때
	
	// 필드 => 속성(property)
	// 1. 인스턴스멤버
	public int age;
	public String userName;
	public String userPw;
	private String userPhone;
	// 2. 클래스멤버
	public static final String PROJECTNAME="JAVA2022";
	
	// 생성자 => 생략가능(기본생성자)
	// 메소드 => 기능
	// 1. 인스턴스멤버
	public void instanceMethod() {
		System.out.println("인스턴스 메소드");
	}
	// 2. 클래스멤버
	public static void classMethod() {
		System.out.println("클래스 메소드");
	}
	
	
}
