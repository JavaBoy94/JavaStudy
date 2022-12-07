package org.study.innerclass;

public class InstanceClass {

	// 인스턴스 멤버
	int age;
	String name;
	
	// 내부클래스 (인스턴스클래스) => 인스턴스 멤버처럼 사용
	class InstaceBasic {
		int age;
		String name;
	}
	
}
