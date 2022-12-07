package org.study.oop;

public class Test1109 {

	// 오버로딩
	public void m1() {}
//	public int m1() {
//		return 0;
//	}
	//반환타입 유형과는 상관X 
	public void m1(int num1) {}
	public void m1(int num1, int num2) {}
	//public void m1(int num3, int num4) {}
	//변수명이 달라도 형식이 동일하면 오버로딩 불가
	public void m1(String str1, int num1) {}

}
	
