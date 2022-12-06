package org.study.loopEx;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		
		System.out.println("==for문==");
		
		// 마지막 숫자 다음에 ,를 없애고 싶을 때 >> 조건문 사용
		for (int i=0; i<11; i++) {
			switch (i) {
			case 10:
				System.out.println(i);
				break;                // break가 걸리면 해당 for문 자체를 벗어남(종료)
			default:
				System.out.print(i+", ");
			}
		}
		
		System.out.println();
		
		for (int i=10; i>=0; i--) {
			switch (i) {
			case 0:
				System.out.println(i);
				break;
			default:
				System.out.print(i+", ");
			}
		}
		
		System.out.println("================");
		
		// 스캐너를 이용 두 정수간의 모든 정수를 출력
		// 첫번째 숫자, 두번째 숫자를 입력받아 첫번째부터 두번째까지 모든 정수를 출력 (첫번째 수 < 두번째 수)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = input.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i == num2) {
					System.out.println(i);
					break;
				} else {
					System.out.print(i + ", ");
				}
			}
		} else {
			System.out.println("오류! 첫번째 수가 두번째 수보다 작아야 합니다!");
		}
		
		
		
		
		
	}
}
