package org.study.oop;

public class Class1Main {

	public static void main(String[] args) {
		
		System.out.println("static멤버(클래스 멤버)");  // new 없이도 (새로운 인스턴스 생성 없이도) 접근 가능
		
		
		Class1.title = "클래스멤버";
		Class1.classMethod();
//		Class1.PROJECTNAME="final 변경불가";         // final 상수는 변경 불가
		
		System.out.println("--------------");
		
		System.out.println(Class1.PROJECTNAME);
		
		Class1 c1 = new Class1();
		c1.name="m1";
		c1.age=20;
		c1.title="title1";
		
		c1.classMethod();
		c1.instanceMethod();
		

		
	}
}
