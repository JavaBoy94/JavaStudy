package org.study.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		// 부모타입으로 자식객체 선언  => 부모타입의 멤버만을 참조가능 => 자식클래스에서 오버라이드한 메소드만을 사용할 때
		
		Parent p1;
		
		p1 = new Child1();
		p1.excuteQueryCommed();
		
		p1 = new Child2();
		p1.excuteQueryCommed();
		
		int i = 10;
		i = 399;
	}
}
