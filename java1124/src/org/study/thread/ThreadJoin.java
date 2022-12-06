package org.study.thread;

class Thread1 extends Thread {
	int num=1;
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			System.out.println("Thread => "+(num++));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		
		System.out.println("main 스레드 시작");
		
		Thread t1 = new Thread1();
		t1.start();
		
		// join의 스레드가 종료될때까지 그 이후의 스레드를 대기시킴
		try {
			t1.join();                  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 스레드 종료");
		
	}
}
