package org.study.polymorphism;

public class Child2 extends Parent {
	
	public int num2;
	
	@Override
	public void excuteQueryCommed() {
		System.out.println("(오버라이드) 자식2 메소드");
//		super.excuteQueryCommed();
	}
	
	public void m2() {
		System.out.println("인스턴스 메소드 m2");
	}
}
