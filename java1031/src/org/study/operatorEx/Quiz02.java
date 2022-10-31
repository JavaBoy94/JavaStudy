package org.study.operatorEx;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 계산기 프로그램 만들기
		// 스캐너로 두 정수(int num1, int num2)와 연산자(+-*/%) 중 하나를 입력받아 계산결과 출력
		
		System.out.println("==슈퍼계산기==");

		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num1 = scn.nextInt();
		
		System.out.print("연산자를 입력하시오 : ");
		String Oper = scn.next();
		
		System.out.print("두번째 정수를 입력하시오 : ");
		int num2 = scn.nextInt();

		if (Oper.equals("+")) {
			System.out.println("연산결과 : "+(num1+num2));
		} else if (Oper.equals("-")) {
			System.out.println("연산결과 : "+(num1-num2));
		} else if (Oper.equals("*")) {
			System.out.println("연산결과 : "+(num1*num2));
		} else if (Oper.equals("/")) {
			System.out.println("연산결과 : "+(num1/num2));
		} else if (Oper.equals("%")) {
			System.out.println("연산결과 : "+(num1%num2));
		} else {
			System.out.println("연산이 올바르지 않습니다 !");
		}
		
		scn.close();
	}
}
