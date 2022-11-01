package org.study.operatorEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 스캐너를 통해 정수를 입력받아 홀짝 프로그램 만들기
		// 스캐너, if문, 산술연산자 등 사용
		// 출력값은 "짝수입니다.", "홀수입니다."로 출력

		System.out.print("정수(양의 정수)를 입력하시오 : ");

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();

		if (num1 % 2 == 0 && num1!=0) { 
			System.out.println("짝수입니다.");
		} else if (num1 == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
