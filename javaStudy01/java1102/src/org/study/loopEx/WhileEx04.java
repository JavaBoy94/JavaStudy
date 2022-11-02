package org.study.loopEx;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		System.out.println("==while문==");
		System.out.println("==구구단 (스캐너사용)==");
		
		// 스캐너를 이용 두 정수간의 구구단 출력
		// 시작 단, 끝 단을 입력받아 시작 단부터 끝 단까지 출력 (시작 단 < 끝 단)
		// while문으로 구현
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시작단 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("둘째단 입력 : ");
		int num2 = input.nextInt();
		
		if (num1<num2) {	
			int i = num1;
			while (i<=num2) {         // 구구단 범위 : num1(시작 단)부터 num2(끝 단)까지
				System.out.println("==="+num1+"단===");
				int j = 1;            // 곱할 값 초기화 (1에서 시작)
				while (j<10) {        // 곱할 값 범위 : 1부터 9까지
					System.out.println(i+" * "+j+" = "+(i*j));   // 곱할 단(i)*곱할 값(j) 출력
					j++;              // 다음 곱할 값으로 증가. 9까지 반복              
				} 
				i++;                  // num1(시작 단)을 9까지 다 곱하면 다음 단으로 증가. num2(끝 단)까지 반복
			} 
		} else {
			System.out.println("시작단이 끝단보다 작아야 합니다 !");
		}
	}
}
