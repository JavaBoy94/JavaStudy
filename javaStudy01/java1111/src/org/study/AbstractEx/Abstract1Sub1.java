package org.study.AbstractEx;
// 구현객체 생성 (추상메소드를 오버라이드하여 구현)
public class Abstract1Sub1 extends Abstract1 {
	
	// 구현객체에서 추상메소드는 반드시 구현해야함
	@Override
	public void abstractM1() {
		System.out.println("추상메소드 M1");
	
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
		
	}

}
