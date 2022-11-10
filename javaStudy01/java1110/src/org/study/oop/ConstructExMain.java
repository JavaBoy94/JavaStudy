package org.study.oop;

import java.util.Scanner;

public class ConstructExMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("생성자로 계산기 만들기");
		
		System.out.print("첫번째 숫자 입력 : ");
		int Num1 = input.nextInt();
		
		System.out.print("연산자 입력 : ");
		String Op = input.next();
		
		System.out.print("두번째 숫자 입력 : ");
		int Num2 = input.nextInt();

//		ConstructEx c1 = new ConstructEx();
//		ConstructEx c2 = new ConstructEx(10, 20);
		ConstructEx c3 = new ConstructEx(Num1, Num2, Op);

//		System.out.println(c3.getNum1());
//		System.out.println(c3.getNum2());
//		System.out.println(c3.getOp());

		int num1 = c3.getNum1();
		int num2 = c3.getNum2();
		String op = c3.getOp();

		if (op.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (op.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (op.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		} else if (op.equals("%")) {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			System.out.println("계산이 올바르지 않습니다.");
		}
	}
}
