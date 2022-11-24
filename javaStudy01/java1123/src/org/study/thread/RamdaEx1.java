package org.study.thread;

interface Inter1 {
	void interm1();
//	void interm4();
}

interface Inter2 {
	void interm2();
}



public class RamdaEx1 {

	public static void main(String[] args) {
		
		// 익명클래스로 interm1 구현
		
		Inter1 in1 = new Inter1() {
			
			@Override
			public void interm1() {
				System.out.println("Inter1 추상메소드1");
				
			}
		};
		
		in1.interm1();
		
		// 람다식으로 익명클래스를 표현하여 구현
		
		Inter1 in2 = ()->{    // 메소드가 2개 이상인 인터페이는 람다식 불가능
			System.out.println("Inter1 추상메소드2");
		};
		
		in2.interm1();
		
		System.out.println("--------------------------------");
		
		// Inter2 익명클래스를 이용하여 추상메소드 interm2 구현
		
		new Inter2() {
			
			@Override
			public void interm2() {
				System.out.println("Inter2 추상메소드1");
				
			}
		}.interm2();
		
		// 람다식 이용
		
		Inter2 in3 = ()->{
			System.out.println("Inter2 추상메소드2");
		};
		
		in3.interm2();
		
	
		
	}
}
