package org.study.AbstractEx;

// 추상클래스 생성
public abstract class Abstract1 {

	int num1;  // 추상클래스도 일반클래스멤버 모두 사용가능 (실질적 의미는 X 추상클래스를 사용하는 목적이 추상메소드이기 때문)
	
	// 추상메소드 생성 (구현부 X => 상속된 구현 객체를 통해 오버라이드로 '반드시' 구현해야 함) 
	public abstract void abstractM1();
	public abstract void abstractM2(String name);
	
	public void m1() {
		System.out.println("일반 메소드 m1");
	}
	
}
