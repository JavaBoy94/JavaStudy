package org.study.innerclass;

public class InnerClassEx {
	// 접근지정자 생략시 => default로 설정
	// 내부클래스(인스턴스클래스) 생성
	class InstanceClass2 {       
		int num1;
		void m1() {
			System.out.println("InstanceClass2의 메소드");
		}
	}
	
	// 내부클래스(스태틱클래스) 생성  => 스태틱메소드를 사용할때
	static class StaticClass2 {  
		static void method1() {
			System.out.println("StaticClass2의 static 메소드");
		}
	}
	
	void localMethod() {
		// 내부클래스(지역클래스) 생성 => 해당 메소드 안에서만 사용가능
		class LocalClass2 {
			int num1;
			void m2() {
				System.out.println("LocalClass2의 메소드");
			}
		}
		
		LocalClass2 loc = new LocalClass2();
		loc.m2();
		
	}
	
	
	
}
