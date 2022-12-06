package org.study.innerclass;

// 인터페이스 생성
interface In1 {
	void m1();
}

// 추상클래스 생성
abstract class Ab1 {
	abstract void m1();
}

// 일반클래스 생성
class C1 {
	void m1() {
		System.out.println("C1의 메소드");
	}
}


public class AnonymousClassEx {

	public static void main(String[] args) {
		
		// 익명클래스 생성 (인터페이스)
		In1 i1 = new In1() {
			
			@Override
			public void m1() {
				System.out.println("In1의 오버라이딩 메소드");
				
			}
		};
		
		i1.m1();
		
		// 익명클래스 생성 (추상클래스)
		Ab1 a1 = new Ab1() {
			
			@Override
			void m1() {
				System.out.println("Ab1의 오버라이딩 메소드");
				
			}
		};
		
		a1.m1();
		
		// 익명클래스 생성 (일반클래스)
		// 일반클래스는 반드시 익명클래스화(오버라이딩) 하진 않음 (일반객체 생성도 가능하므로)
		C1 c1 = new C1() {
			
			@Override
			void m1() {
				System.out.println("C1의 오버라이딩 메소드");
//				super.m1();
			}
		};
		
		c1.m1();
		
	}
}
