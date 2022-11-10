package org.study.polymorphism;

class A {
	int a;
		
}

class B extends A {
	int b;
}

class C extends B {
	int c;
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		A a = new A();     // a는 A타입의 객체참조변수
		a=new B();
		a=new C();
		B b = new B();     // b는 B타입의 객체참조변수
		C c = new C();     // c는 C타입의 객체참조변수
		
		a.a=10;  
		
		b.a=20;
		b.b=30;
		
		c.a=40;
		c.b=50;
		c.c=60;
		
		// 다형성 : 부모 타입의 객체참조변수로 자식 타입의 객체를 참조
		
		A a2 = new B();   // A(부모타입)의 객체참조변수 a2로 B(자식 객체)를 참조 => 부모클래스로 자식타입 객체를 참조할 경우, 부모클래스의 멤버만을 참조할 수 있음
		a2.a=10;   // a2는 부모타입의 멤버인 a만을 참조 가능. (자식타입 멤버인 b는 참조불가)
				
	}
}
