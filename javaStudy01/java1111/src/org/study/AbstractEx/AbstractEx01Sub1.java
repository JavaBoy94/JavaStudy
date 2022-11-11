package org.study.AbstractEx;

// 추상클래스를 상속 => 1) 자식클래스를 추상클래스로 선언 or 2) 자식클래스에서 추상메소드를 오버라이드 택1
public class AbstractEx01Sub1 extends AbstractEx01 {

	// 1. 자식클래스에서 추상메소드를 오버라이드하여 구현 (많이 사용)
	@Override
	public void abstractMethod() {
		System.out.println("추상메소드 오버라이드");
		
//	// 2. 자식클래스를 다시 추상클래스화  => 다시 추상클래스를 만들기 때문에 추상메소드도 다시 만들어야 함
//		public abstract void abstractMethod2();
		
	}

}
