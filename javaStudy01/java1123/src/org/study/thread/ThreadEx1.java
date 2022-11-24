package org.study.thread;

// 스레드 생성방법 1 - Thread클래스를 상속
class ThreadSub extends Thread {
	// run 메소드를 오버라이드
	@Override
	public void run() {
		System.out.println("Thread run() 메소드");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("스레드");
		
		System.out.println("스레드 생성 1 - Thread클래스");
		// thread 구현객체의 인스턴스 생성
		Thread t1 = new ThreadSub();
		
		// 스레드 시작 (start)
		t1.start();
	}
}
