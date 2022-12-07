package org.study.InterfaceEx;
// 2개의 인터페이스를 다중상속
public class InterfaceEx01Sub1 implements InterfaceEx1, InterfaceEx2 {

	public int num1;
	public void method1() {
		System.out.println("일반메소드");
	}
	
	@Override
	public void abstractMethod1() {
		System.out.println("오버라이딩");
		
	}

	@Override
	public void abstractMethod2() {
		System.out.println("오버라이딩2");
		
	}
	

	
}
