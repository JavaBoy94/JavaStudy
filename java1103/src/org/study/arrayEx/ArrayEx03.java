package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		System.out.println("==배열==");
		
		// 로또 프로그램 만들기
		// 로또는 총 6번을 뽑으며, 각 횟수마다 1~45까지의 숫자가 랜덤으로 나옴(중복X)  => math.random() 사용 => 배열의 임의의 번지(index)를 추출
		// 0번지~44번지 => 1~45 배열
		
		int[] lotto = new int[45];              // 1. 배열 선언
		System.out.println(lotto.length);
		
		for (int i=0; i<lotto.length; i++) {    // 2. 초기화 (for문 사용)
			lotto[i] = i+1;
//			System.out.print(lotto[i]+" ");
		}
		
//		System.out.println(Math.random());  // random은 더블형 => 0이상 1미만의 범위에서 무작위로 추출하기 때문 (0<=Math.random()<1)
//		System.out.print("무작위 추출 결과 (1~45) : "+(int)(Math.random()*46));  // 46만큼 곱해주면 0~45까지 정수로 무작위 추출 가능 !
		
		int temp;       // 무작위 추출한 값을 임시로 담아둘 빈 변수공간 생성
		
		for (int i=0; i<1000; i++) {
			int index = (int)(Math.random()*45); // random 인덱스 (0~44번지)
//			System.out.println(lotto[index]);
			temp = lotto[index];      // random값을 temp에 저장
			lotto[index] = lotto[0];  // 0번지값을 random에 저장
			lotto[0] = temp;
		}
		
		System.out.println("=로또 추첨 결과=");
		
		for (int i=0; i<6; i++) {
			if (i==5) {
				System.out.print(lotto[i]);
				break;
			}
			System.out.print(lotto[i]+",");
		}
	}
}
