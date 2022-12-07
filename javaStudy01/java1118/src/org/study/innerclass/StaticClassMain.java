package org.study.innerclass;

public class StaticClassMain {

	public static void main(String[] args) {
		
		System.out.println("내부클래스(스태틱클래스)");
		
		// 외부클래스 멤버
		StaticClass outC = new StaticClass();
		outC.age = 20;
		outC.name = "외부클래스의 멤버";
		System.out.println(outC.name);
		
		StaticClass.StaticBasic stC = new StaticClass.StaticBasic();
		stC.age = 10;
		stC.name = "스태틱클래스의 멤버";
		System.out.println(stC.name);
		stC.staticMethod();

		StaticClass.StaticBasic.staticMethod();
		
	}
}
