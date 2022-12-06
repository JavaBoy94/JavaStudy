package org.study.oop;

public class OverLoading1 {

	// 오버로드 => 같은 메소드명의 중복을 허용 (단, 매개변수 형식이 달라야함 => 변수명이 달라도 같은 형식이면 동일한것으로 간주)
	// 대표적인 오버로드 메소드 ex) prinln();
	
	public int num1;
	public static int num2;
	
	public static void staticMethod1() {
//		num1=100;          // static메소드는 static멤버만 접근 가능
		num2=200;
	}
	
	public void non_staticMethod1() {
		staticMethod1();   // staticMethod1을 호출
		num1=100;          // non-static 메소드는 static멤버 구분없이 접근 가능
		num2=200;
	}
	
	public void method1() {
		System.out.println("method1");
	}

	public void method1(int num1) {
		System.out.println(num1);
		System.out.println();
	}

	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
	}

	public void method1(String name, int num1) {
		System.out.println(name);
		System.out.println(num1);
	}
}
