package org.study.innerclass;

public class InnerClassBasic {

	// 내부클래스 => 클래스 안에 생성된 클래스
	
	
	// 1. 인스턴스 클래스
	class InstanceClass {
		int i = 0;
		final static int NUM = 100;
	}
	
	// 2. 스태틱 클래스
	static class StaticInner {
		int i = 10;
		static int i2 = 20;
	}
	
	// 3. 로컬 클래스  => 외부클래스의 메소드나 초기화 블럭 안에서 선언되는 내부클래스
	public void localMethod() {
		class LocalClass {   // 로컬클래스는 선언된 영역(localMethod) 안에서만 사용 가능 >> 캡슐화
			int i = 10;
			
			final static int NUM = 100;
			void local1() {
				System.out.println("local 메소드");
			}
		}
		
		LocalClass l1 = new LocalClass();
		l1.local1();
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceClass.NUM);
		System.out.println(StaticInner.i2);
	}
}
