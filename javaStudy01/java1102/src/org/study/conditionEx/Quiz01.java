package org.study.conditionEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		System.out.println("산술계산 프로그램");

		Scanner input = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		double num1 = input.nextDouble();

		System.out.print("연산 입력 (+, -, *, /) : ");
		String op = input.next();

		System.out.print("두번째 정수 입력 : ");
		double num2 = input.nextDouble();

		double result = 0;

		if (op.equals("+")) {
			result = num1+num2;
		} else if (op.equals("-")) {
			result = num1-num2;
		} else if (op.equals("*")) {
			result = num1*num2;
		} else if (op.equals("/")) {
			result = num1/num2;
		} else {
			System.out.println("연산이 올바르지 않습니다 !");
		}
		
		System.out.println(num1+" "+op+" "+num2+" = " + result);
	}
}
