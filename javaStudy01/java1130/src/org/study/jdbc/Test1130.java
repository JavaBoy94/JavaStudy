package org.study.jdbc;


class A {
	String name;
	
	public A() {
		System.out.println("기본생성자");
	}
	
	// 생성자 오버로드
	public A(String name) {
		this.name = name;      // name필드의 setter
		System.out.println(name);
	}
}

public class Test1130 {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A("오버로딩");
	}
}
