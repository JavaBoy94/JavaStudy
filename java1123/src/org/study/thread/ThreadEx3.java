package org.study.thread;

// 스레드 생성방법 2 - Runnable 인터페이스 상속
class ThreadSub3 implements Runnable {
	// run메소드(추상메소드) 오버라이드
	@Override
	public void run() {
		System.out.println("Runnable run() 메소드");
		
	}
	
}


public class ThreadEx3 {

	public static void main(String[] args) {
		
		System.out.println("스레드");
		
		// Runnable 스레드실행 1 - Runnable의 구현객체를 매개변수로 받는 Thread 객체 생성
		Runnable r1 = new ThreadSub3();
	
		Thread t1 = new Thread(r1);
		t1.start();
		
		// Runnable 스레드 실행 2 - Runnable의 익명객체를 매개변수로 받는 Thread 객체 생성
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable 익명객체의 run() 메소드");
			}
		});
		t2.start();
		
		
		// Runnable 스레드 실행 3 - 람다식 이용
		// 람다식(익명함수) => 특정형식을 생략한 형태
		Thread t3 = new Thread(()->{
			System.out.println("람다식으로 구현된 run() 메소드");
		});
		t3.start();
	}
}
