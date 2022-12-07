package org.study.exceptionEx;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		// 스캐너로 입력받은 정수 num2로 num1을 나누는 결과출력
		
		Scanner input = new Scanner(System.in);
		
		int num1 = 100;
		
		System.out.print("나눌 숫자 입력 : ");
		int num2 = input.nextInt();
		
		// ArithmeticException
//		System.out.println(num1/num2);      // num2가 0이면 에러가 발생하여 그 지점에서 프로그램이 중단 (에러지점 이후는 실행 X) 
		
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			e.printStackTrace();          // 해당 예외메시지 출력
			System.out.println("예외 발생시 처리문");
		} finally {
			System.out.println("예외와 상관없이 실행");
		}
		
		System.out.println("프로그램 정상실행");      
		
		
		
	}
}
