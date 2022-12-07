package org.study.BasicPackage;

import java.util.Random;

public class RandomEx3 {

	public static void main(String[] args) {
		
		System.out.println("Random클래스");
		
		// 로또 만들기
		
		// 1. 배열생성
		int[] lotto = new int[45];
		
		for (int i=0; i<45; i++) {
			lotto[i] = i+1;    // 1~45
//			System.out.print(lotto[i]+" ");
		}
		
		int temp = 0;
		
		for (int i=0; i<1000; i++) {               // 로또 배열 1000번 무작위로 섞기 
			int idx = (int) (Math.random()*45);    // 무작위 번지수(인덱스) 추출
			temp = lotto[idx];                     // 로또 배열의 무작위 번지수 값을 temp에 저장
			lotto[idx] = lotto[0];                 // 로또 배열의 첫번째 번지수값을 temp에 넣었던 번지수로 이동
			lotto[0] = temp;                       // temp에 담았던 값을 다시 로또 배열의 첫번째 번지수에 저장
		}
		
		String result = "";
		
		for (int i=0; i<6; i++) {
			result = lotto[i] + " ";
			System.out.println(result);
		}
		
	}
}
