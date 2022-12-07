package org.study.loopEx;

import java.util.Scanner;

public class WhileEx07 {

	public static void main(String[] args) {

		System.out.println("==while(true)==");

		// 계산기 만들기 (+-*/)
		// "exit"을 입력하면 프로그램 종료
		// 스캐너, while(true), if/break 사용

		Scanner input = new Scanner(System.in);

		System.out.println("계산기를 돌려요~~~ ");

		while (true) {
			System.out.println("시작 : 아무 키 입력 / 종료 : exit 입력");
			String ex = input.next();

			if (ex.equals("exit")) {
				System.out.println("계산기를 종료합니다.");
				input.close();
				break;
			} else {
				System.out.print(" 첫번째 수 입력 : ");
				int num1 = input.nextInt();

				System.out.print("연산자(+-*/): ");
				String op = input.next();

				System.out.print(" 두번째 수 입력 : ");
				int num2 = input.nextInt();

				if (ex.equals("exit")) {
					System.out.println("계산기를 종료합니다.");
					input.close();
					break;
				} else if (op.equals("+")) {
					System.out.println("연산결과 : " + num1 + " + " + num2 + " = " + (num1 + num2));
				} else if (op.equals("-")) {
					System.out.println("연산결과 : " + num1 + " - " + num2 + " = " + (num1 - num2));
				} else if (op.equals("*")) {
					System.out.println("연산결과 : " + num1 + " * " + num2 + " = " + (num1 * num2));
				} else if (op.equals("/")) {
					System.out.println("연산결과 : " + num1 + " / " + num2 + " = " + (num1 / (double)num2));
				} else {
					System.out.println("연산이 올바르지 않습니다 !");
				}
				System.out.println();
			}
			continue;
		}
		input.close();
	}
}
