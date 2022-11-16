package org.study.BasicPackage;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		System.out.println("Random클래스");
		
		Random r = new Random();
		
		// 정수
		System.out.println(r.nextInt());      // 음수,0,양수 포함
		System.out.println(r.nextInt(100));   // 0~99 정수
		System.out.println(r.nextLong());     
		
		// 실수   (0 <= r < 1)
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
	}
}
