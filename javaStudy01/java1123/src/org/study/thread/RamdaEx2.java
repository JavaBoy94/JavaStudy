package org.study.thread;

// 상속

// 1. 일반클래스
class A {
	int num;
	
	void m1() {
		System.out.println("m1");
	}
}
// 일반클래스의 상속
class B extends A {
//	@Override
//	void m1() {
//		System.out.println("m1의 오버라이드 메소드");
//	}
	
	void m2() {
		System.out.println("m2");
	}
}

// 2. 추상클래스
abstract class Ab1 {
	int num;
	void M1() {
		System.out.println("M1메소드");
	}
	abstract void abM1();
}
// 추사클래스의 상속
class Ab1Sub1 extends Ab1 {

	@Override
	void abM1() {
		System.out.println("abM1의 오버라이드 메소드");
	}
	
}

// 3. 인터페이스
interface Int1 {
	static final int MAXNUM=100;
	default void defM1() {
		System.out.println("default 메소드");
	}
	void inM1();   // abstract 생략
}
// 인터페이스의 상속(구현)
class Int1Sub implements Int1 {

	@Override
	public void inM1() {
		System.out.println("inM1의 오버라이드 메소드");
		
	}
}

public class RamdaEx2 {

	public static void main(String[] args) {
		
		// 일반클래스의 익명클래스 
		new A() {
			@Override
			void m1() {
				System.out.println("m1의 오버라이드 메소드");
			}
		}.m1();
		
		// 추상클래스의 익명클래스
		new Ab1() {
			
			@Override
			void abM1() {
				System.out.println("abM1의 오버라이드 메소드");
				
			}
		}.abM1();
		
		// 인터페이스의 익명클래스
		new Int1() {
			
			@Override
			public void inM1() {
				System.out.println("inM1의 오버라이드 메소드");
				
			}
		}.inM1();
		
		// 람다식으로 익명클래스 구현  => 메소드가 하나인 인터페이스만 가능 (함수형 인터페이스)
		Int1 in1 = ()->{
			System.out.println("람다식으로 구현한 inM1의 오버라이드 메소드");
		};
		
		in1.inM1();
		
		
		
	}
}
