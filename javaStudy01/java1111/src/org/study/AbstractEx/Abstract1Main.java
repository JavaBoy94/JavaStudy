package org.study.AbstractEx;

public class Abstract1Main {

	public static void main(String[] args) {
		
		//추상클래스(abstract 타입)는 객체생성 불가 => 상속된 구현객체를 통해 객체생성 가능
//		new Abstract1();   
		
		Abstract1Sub1 a = new Abstract1Sub1();
		a.abstractM1();
		a.abstractM2("추상메소드 M2의 매개변수");
		
		System.out.println();
		
		Abstract1Sub2Sub1 a2 = new Abstract1Sub2Sub1();
		a2.abstractM1();
		a2.abstractM2("추상메소드 M2의 매개변수");
		a2.abstractM3();
		
		// 다형성 적용 (부모타입의 객체참조변수로 자식객체 선언) => 부모타입의 클래스멤버만 접근 가능
		// 구현객체로 만드려는 객체가 abstract타입이 아니라면 다형성 적용이 가능!
		
		Abstract1 a3 = new Abstract1Sub2Sub1();
		a3.num1=10;
		a3.abstractM1();
		a3.abstractM2("매개변수");
		a3.m1();
		
		Abstract1Sub2 a4 = new Abstract1Sub2Sub1();
		a4.num1=20;
		a4.abstractM1();
		a4.abstractM2("매개변수");
		a4.m1();
		
		a4.abstractM3();
		
		// 구현객체간의 직접적인 상속관계가 없으면 다형성 성립 불가능!
		
//		Abstract1Sub1 a5 = new Abstract1Sub2Sub1();
		
	}

}
