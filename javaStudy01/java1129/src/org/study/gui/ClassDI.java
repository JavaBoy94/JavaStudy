package org.study.gui;

import java.sql.Date;

class A {
	public A() {
		System.out.println("A 기본생성자 메소드");
	}
}

interface A1 {
	abstract void m1(int in);
}

class B {
	
	A a;
	Date day;
	A1 a1;
	
	public B() {
		System.out.println("B 기본생성자 메소드");
	}
	
	public B(A a) {  // A타입을 받는 생성자 오버라이드
		this.a=a;
	}
	
	public void dayMethod(Date day) {
		this.day=day;
		System.out.println();
	}
	
	public void interM(A1 a1) {
		this.a1=a1;
	}

	public A getA() {
		return a;
	}

	public Date getDay() {
		return day;
	}
	
}


public class ClassDI {
	
	

	public static void main(String[] args) {
		
		new B(new A());  // 객체형타입을 매개변수로 받을때 => 매개변수에 new 객체선언 가능
		new B().interM(new A1() {     // 익명클래스로 인터페이스 구현
			
			@Override
			public void m1(int in) {
				System.out.println("익명클래스 메소드");
				
			}
		});
		new B().interM((int in)->{   // 매개변수를 받는 추상메소드를 가진 인터페이스를 람다식으로 구현할 경우 => 매개변수를 람다식에 선언
			System.out.println("람다식 메소드");
		});
	}
}
