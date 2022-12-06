package org.study.innerclass;

public class LocalClass {

	// 지역클래스  => 메소드 안에서 선언
	public void outClassMethod() {
		
		class LocalClassBasic {
			void LocalClassMethod() {
				System.out.println("로컬클래스의 메소드");
			}
		}
		
		// 로컬클래스가 만들어진 메소드 안에서 로컬클래스의 인스턴스를 생성하여 사용
		LocalClassBasic localC = new LocalClassBasic();
		localC.LocalClassMethod();
	}
}
