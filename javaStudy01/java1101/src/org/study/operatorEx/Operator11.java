package org.study.operatorEx;

import java.util.Scanner;

public class Operator11 {

	public static void main(String[] args) {

		System.out.println("삼항연산자");
		
		System.out.print("숫자입력 : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int result = num > 10 ? 1 : 0;
		System.out.println("int 결과 : " + result);

		boolean bool = num > 10 ? true : false;
		System.out.println("boolean 결과 : " + bool);

		String str = num > 10 ? "10보다 큽니다." : "10보다 크지 않습니다.";
		System.out.println("String 결과 : " + str);

		if (num > 10) {
			System.out.println("10보다 크다");
		} else {
			System.out.println("10보다 크지 않다");
		}

	}

}
