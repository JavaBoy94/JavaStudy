package org.study.innerclass;

interface A {
	// 추상메소드 생성
	void ab1();
}

// 구현객체 생성
class A1 implements A {

	@Override
	public void ab1() {
		System.out.println("ab1 오버라이딩");
	}
}

public class AnonymousClass1 {
	
	public static void main(String[] args) {
	
		A1 a1 = new A1();
		a1.ab1();
		
		// 익명클래스 생성  => 객체참조변수 없이 바로 부모타입(A)으로 구현객체 생성 후 오버라이딩
		new A() {
			
			@Override
			public void ab1() {
				System.out.println("익명클래스로 ab1 오버라이딩");
			}
		};  
	}
}
