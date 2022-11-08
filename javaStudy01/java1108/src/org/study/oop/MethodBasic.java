package org.study.oop;

public class MethodBasic {

	// 메소드
	// 인스턴스 메소드
	public void method1() {
		System.out.println("method1 : 반환값 X, 매개변수X");
	  //return;  생략가능
	}
	
	public int method2() {
		System.out.println("method2 : 반환값O, 매개변수X");
		int num1=10;
		int num2=20;
		return num1+num2;
	}
	
	public void method3(int num1, int num2) {
		System.out.println("method3 : 반환값X, 매개변수O");   // 매개변수 => 지역변수 (메소드 안에서 선언된 변수)
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	  //return;
	}
	
	public int method4(int num1, int num2) {
		System.out.println("method4 : 반환값O, 매개변수O");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		return num1+num2;
	}
	
	// 클래스 메소드 => static 사용
	public static void classMethod1() {
//		userId="m222";
		System.out.println("클래스 메소드");
	}
}
