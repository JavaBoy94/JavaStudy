package org.study.AbstractEx;

// 추상클래스를 상속 =>  자식클래스에서 추상메소드를 오버라이드
public class AbstractEx01Sub3 extends AbstractEx01Sub2 {

	// 추상클래스를 상속받은 추상클래스를 다시 상속받았으므로 추상메소드도 2개를 오버라이드
	@Override
	public void abstractMethod2() {
		System.out.println("추상메소드 2 오버라이드");
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("추상메소드 1 오버라이드");
		
	}
		
}
