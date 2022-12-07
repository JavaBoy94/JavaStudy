package org.study.AbstractEx;
// 추상클래스화된 구현객체(Abstract1Sub2)를 다시 상속받는 구현객체 생성 (추상메소드를 오버라이드하여 구현)
// 일반클래스타입의 구현객체이므로 new 생성 가능
public class Abstract1Sub2Sub1 extends Abstract1Sub2 {

	@Override
	public void abstractM3() {
		System.out.println("추상메소드 M3");
		
	}

	@Override
	public void abstractM1() {
		System.out.println("추상메소드 M1");
		
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
		
	}


}
