package org.study.Inheritance;

class A {
	public int num1;
	private int num2;
	protected int num3;
	
	public void method1() {
		System.out.println("A method1");
	}
}

class B extends A {
	int num4;
	@Override
	public void method1() {
		System.out.println("(Override) B method1");
//		super.method1();
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
//		A a = new A();
// 		B b = new B();
// 		A b2 = new B();  // 부모타입으로 자식 객체 생성 (다형성) -> 자식객체 타입이 부모타입으로 형 변환 (업캐스팅) -> 부모타입의 멤버만 참조가능
// 		b2.method1();    // 업캐스팅된 객체에서 부모 메소드를 실행하면 자동으로 오버라이드된 메소드가 실행됨
		
		
		A a;             
		a=new B();       
		a.method1();
	}
}
