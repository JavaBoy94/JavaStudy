package org.study.operatorEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 대문자를 입력받아 소문자로 변경한 값을 콘솔에 출력
		// 소문자를 입력받아 대문자로 변경한 값을 콘솔에 출력
		// 스캐너, .next().charAt(0) 사용
		
		Scanner input = new Scanner(System.in);

		System.out.print("소문자로 변경할 대문자 입력 : ");
		char ch1 = input.next().charAt(0);
		System.out.println("소문자 : "+(char)(ch1+32)+"("+(ch1+32)+")");
		
		System.out.print("대문자로 변경할 소문자 입력 : ");
		char ch2 = input.next().charAt(0);
		System.out.println("대문자 : "+(char)(ch2-32)+"("+(ch2-32)+")");
		
		input.close();
		
	}
}
