package org.study.AbstractEx;

public class AbstractMain {
	
	public static void main(String[] args) {
		
		// 추상(abstract) 타입은 인스턴스 생성(new) 불가
		
//		new AbstractEx01();
//		new AbstractEx01Sub2(); 
		
		// 상속으로 만들어진 클래스(추상메소드를 만든경우)를 통해 인스턴스 생성 가능
		AbstractEx01Sub1 a1 = new AbstractEx01Sub1();
		a1.abstractMethod();
		
		AbstractEx01Sub3 a2 = new AbstractEx01Sub3();
		a2.abstractMethod();
		a2.abstractMethod2();
	
	}
}
