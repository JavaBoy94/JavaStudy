package org.study.oop;

//접근지정자(접근제한자) class 클래스명
public class ClassBasic {     

// 1. 필드(속성)
//  접근지정자    타입        필드명;
	public String userId;
	public String userPw;
	public int age;

// 2. 생성자(Contructor)  => 생략시 기본생성자
//  publuc    클래스명
//	public ClassBasic() {
//		System.out.println("생성자(기본생성자)");
//	}
	
// 3. 메소드(기능)	=> 기능의 대상이되는 매개인자(parameter)를 가짐
// 접근지정자  반환타입    메소드명(매개인자)
	public void instanceMethod() {                // * void 반환타입 : 리턴값이 없을 때
		System.out.println("메소드(인스턴스)");
	}
}
