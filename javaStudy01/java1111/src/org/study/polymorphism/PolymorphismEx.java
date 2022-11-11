package org.study.polymorphism;

class A {
	int num1;
}

class B extends A {
	int num2;
}

class C extends B {
	int num3;
}

public class PolymorphismEx {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.num1=10;
		A a2 = new B();
		a2.num1=20;
		A a3 = new C();
		a3.num1=30;
		
//		B b1 = new A();   // 자식타입으로 부모 객체 참조는 불가능 (자식클래스의 멤버가 부모클래스 멤버 수보다 많기 때문)
		B b2 = new B();
		b2.num1=10;
		b2.num2=20;
		B b3 = new C();
		b3.num1=30;
		b3.num2=40;
		
//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
		c3.num1=10;
		c3.num2=20;
		c3.num3=30;
		
		
		// 하나의 객체를 여러 부모타입으로 선언할 경우
		
		A a = new C();
		a.num1=100;
		
		B b = new C();
		b.num1=200;
		b.num2=300;
		
		C c = new C();
		c.num1=400;
		c.num2=500;
		c.num3=600;
	}
}
