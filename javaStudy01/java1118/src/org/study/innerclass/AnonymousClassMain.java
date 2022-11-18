package org.study.innerclass;

public class AnonymousClassMain {

	public static void main(String[] args) {
		
		// 익명클래스 생성 => 구현객체와 인스턴스 생성을 한번에 처리하여 일회성으로 사용
		Interface1 anC = new Interface1() {
			
			@Override
			public void excute() {
				System.out.println("익명클래스에서 오버라이딩한 메소드");
				
			}
		};
		
		anC.excute();
	}
}
