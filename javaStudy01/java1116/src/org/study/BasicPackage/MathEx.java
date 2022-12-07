package org.study.BasicPackage;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {
		
		System.out.println("Math");
		
		double d = Math.random();
		System.out.println(d);         // 0 <= Math.random() < 1
		
		// 1~100까지의 랜덤한 정수 (10번실행)
		for (int i=0; i<10; i++) {
			System.out.println((int)(Math.random()*100)+1);
		}
		
		System.out.println();
		
		// 1~45까지의 랜덤한 정수 (10번실행)
		for (int i=0; i<10; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
		
		System.out.println("----------");
		
		System.out.println(Math.min(100, 50));
		System.out.println(Math.max(100, 50));
		System.out.println(Math.abs(100));
		System.out.println(Math.ceil(11.2));
		System.out.println(Math.floor(11.2));
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(11.3));
		System.out.println(Math.PI);        // 메소드가 아닌 필드. public static final double PI = 3.14159265358979323846;
		
		System.out.println("Random 클래스");
		
		Random r = new Random();
		int rad1 = r.nextInt();         // int형 랜덤값
		int rad2 = r.nextInt(100);      // 100까지 0 <= r <= 100
	}
}
