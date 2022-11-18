package org.study.innerclass;

public class StaticClass {

	int age;
	String name;
	
	static class StaticBasic {
		int age;
		String name;
		static void staticMethod() {
			System.out.println("스태틱클래스의 스태틱메소드");
		}
	}
}
