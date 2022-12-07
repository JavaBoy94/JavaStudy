package org.study.BasicPackage;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		System.out.println("Random클래스");
		
		Random r = new Random();
		
		// for문으로 5번 실행하여 정수값 난수 뽑기
		
		for (int i=0; i<5; i++) {
			System.out.println(r.nextInt());
		}
		
		System.out.println("-----------");
		
		// for문으로 5번 실행하여 1~45 무작위 뽑기
		
		for (int i=0; i<5; i++) {
			System.out.println(r.nextInt(45)+1);
		}
		
		System.out.println("-----------");
		
		// for문으로 5번 실행하여 랜덤 소수점 두자리 (printf)
		
		for (int i=0; i<5; i++) {
			System.out.printf("%.2f\n", r.nextDouble());  // %.2f => 소수점2자리의 float형  
		}
		
	}
}
