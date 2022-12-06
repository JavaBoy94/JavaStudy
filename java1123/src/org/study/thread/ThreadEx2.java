package org.study.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread {
	int num = 0;
	
	@Override
	public void run() {
		
		// 1초 지연 후 비프음을 발생시키는 메소드 정의
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<10; i++) {
			System.out.println("ThreadSub2 : num => "+(num++));
			toolkit.beep();   // 비프음 발생
			
			try {
				Thread.sleep(1000);   // 스레드를 1초동안 멈춤(지연)  => 예외처리 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		
		System.out.println("스레드");
		
		 ThreadSub2 t1 = new ThreadSub2();
		 t1.start();  // run 메소드 실행
		 
		 for (int i=0; i<5; i++) {       // t1의 메소드가 모두 끝나고 실행되지 않고, 메인 쓰레드의 for문이 동시에 번갈아가며 실행됨 (정확히는 메인이 우선실행)  => 동시성
			 System.out.println("main Thread : "+i);
			 
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 System.out.println("main Thread 종료!");       // t1과 main 스레드가 동시에 실행됨  => 멀티스레드?
	}
}
