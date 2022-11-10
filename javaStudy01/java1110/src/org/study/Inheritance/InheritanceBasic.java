package org.study.Inheritance;

// 상속과 생성자 관계

class Parent {
	public int num1;
	public int num2;
	protected String op;   // protected => 같은패키지 및 상속관계에서 접근 허용
	
	public Parent(int num1) {
		System.out.println("오버로딩한 부모 생성자");
	}
	
	public Parent() {
		System.out.println("부모 기본생성자");
	}
	
	public void parentMethod() {
		System.out.println("ParentMethod(상속받은 메소드)");
	}
}

class Son1 extends Parent {
	public int num3;
	
	@Override     // 어노테이션(@) => 해당기능이 적용되었음을 알려주는 주석기호.
	public void parentMethod() {      // 오버라이드시 선언부는 부모메소드와 동일, 구현부에서 재정의
		System.out.println("Son1ParentMethod(오버라이드 메소드)");
//		super.parentMethod();    // super. => 오버라이드 하지않은 부모메소드를 그대로 사용
	}
}

class Son2 extends Parent {
	public int num4;
	
	public Son2() {
		super(10);   // 오버로딩한 부모 생성자를 호출
	}
	
	public void son2Method() {
		System.out.println("Son2Method");
	}
}
public class InheritanceBasic {

	public static void main(String[] args) {
		Parent P = new Parent();
		Son1 S1 = new Son1();   // S1객체는 Parent, Son1클래스의 모든 멤버를 갖고있음
		S1.parentMethod();
		Son2 S2 = new Son2();
		S2.parentMethod();
		S2.son2Method();
	}
}
