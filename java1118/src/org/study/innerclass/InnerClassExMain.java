package org.study.innerclass;

public class InnerClassExMain {
	
	public static void main(String[] args) {
		
		// 인스턴스클래스 호출
		
		// 1. new 외부클래스().new 인스턴스클래스();
		InnerClassEx.InstanceClass2 inC = new InnerClassEx().new InstanceClass2();
		inC.num1 = 10;
		inC.m1();
		
		// 2. 외부클래스 객체참조변수.new 인스턴스클래스();
		InnerClassEx inner1 = new InnerClassEx();
		InnerClassEx.InstanceClass2 inC2 = inner1.new InstanceClass2();
		inC2.num1 = 20;
		inC2.m1();
		
		// 스태틱클래스 호출
		
		// new 외부클래스.스태틱클래스();
		InnerClassEx.StaticClass2 stC = new InnerClassEx.StaticClass2();
		stC.method1();
		
		// 지역클래스 호출
		
		// 외부클래스 객체 생성후 지역클래스가 선언된 메소드 호출
		InnerClassEx inner2 = new InnerClassEx();
		inner2.localMethod();
		
		// 익명클래스 호출
		
		// 부모클래스로 new 생성 후 오버라이드
		InnerClassEx anC = new InnerClassEx() {
			@Override
			void localMethod() {
				System.out.println("익명클래스로 오버라이딩한 메소드");
//				super.localMethod();
			}
		};
		
		anC.localMethod();
	}
}
