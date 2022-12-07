package org.study.InterfaceEx;

interface A1 {
	abstract void a1();
}

interface B1 {
	abstract void b1();
}

class ABSub {
	
}

// 인터페이스 다중상속을 클래스에서 바로 선언 가능 
// 클래스 extends 클래스 implements 인터페이스1, 인터페이스2
public class InterfaceEx5Main extends ABSub implements A1, B1 {

	@Override
	public void b1() {
		System.out.println("오버라이딩 b1");
		
	}

	@Override
	public void a1() {
		System.out.println("오버라이딩 a1");
		
	}
	
	public static void main(String[] args) {
//		a1();   // static멤버만 참조가능
		
	}
}
