package org.study.polymorphism;

public class Child1 extends Parent {
	
	public int num1;
	
	@Override
	public void excuteQueryCommed() {
		System.out.println("(오버라이드) 자식1 메소드");
//		super.excuteQueryCommed();
	}
	
	public void m1() {
		System.out.println("인스턴스 메소드 m1");
	}
}
