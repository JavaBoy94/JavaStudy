package org.study.innerclass;

public class InstanceClassMain {

	public static void main(String[] args) {
		
		System.out.println("내부클래스(인스턴스클래스)");
		
		// 인스턴스클래스를 사용하려면 반드시 외부클래스 생성이 필요
		InstanceClass outC = new InstanceClass();
		outC.age = 20;
		outC.name = "외부클래스의 인스턴스 멤버";
		System.out.println(outC.name);
		
		// 외부클래스.내부클래스 로 접근
		// 내부클래스(InstanceBasic)의 인스턴스 생성
		InstanceClass.InstaceBasic inC1 = outC.new InstaceBasic();
		inC1.age = 10;
		inC1.name = "내부클래스의 인스턴스 멤버";
		System.out.println(inC1.name);
		
		InstanceClass.InstaceBasic inC2 = new InstanceClass().new InstaceBasic();
		inC2.age = 30;
		inC2.name = "내부클래스의 인스턴스 멤버";
		System.out.println(inC2.name);
	}
}
