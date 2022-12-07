package org.study.innerclass;

public class LocalClassMain {

	public static void main(String[] args) {
		
		System.out.println("내부클래스(지역클래스)");
		
		// 외부클래스 인스턴스 생성
		LocalClass outC = new LocalClass();
		
		// 외부클래스 인스턴스에 접근하여 지역클래스가 속한 메소드를 호출
		outC.outClassMethod();
		
	}
}
