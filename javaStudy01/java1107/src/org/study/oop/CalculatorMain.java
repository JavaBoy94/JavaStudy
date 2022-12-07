package org.study.oop;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		// caculator 생성 후 필드 num1, num2, op를 초기화   => 해당 클래스에 매개인자가 주어지지 않았기 때문
		// op에 따라 연산처리 => 스캐너, if~else, while 사용
		// 메소드 sum(+), sub(-), mult(*), div(/), rem(%)
		// while로 계속 동작하다가 exit입력하면 종료
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("계산기를 돌려요~~");
		
		// 1. 객체 생성
		Calculator c1 = new Calculator();
		
		// 2. 필드 초기화
		while (true) {
			System.out.println("시작 : 아무 키 입력 / 종료 : exit 입력");
			String ex = input.next();
			
			if (ex.equals("exit")) {
				System.out.println("계산기 종료 !");
				input.close();
				break;
			} else {
				System.out.print("숫자1 입력 : ");
				c1.num1=input.nextInt(); 
				
				System.out.print("연산입력(+-*/%) : ");
				c1.op=input.next();
				
				System.out.print("숫자2 입력 : ");
				c1.num2=input.nextInt(); 
				
				
				// 3. 연산호출 (if~else 사용)
				if (ex.equals("exit")) {
					System.out.println("계산기 종료 !");
					input.close();
					break;
				} else if (c1.op.equals("+")) {
					c1.sum();
				} else if (c1.op.equals("-")) {
					c1.sub();
				} else if (c1.op.equals("*")) {
					c1.mult();
				} else if (c1.op.equals("/")) {
					c1.div();
				} else if (c1.op.equals("%")) {
					c1.rem();
				} else {
					System.out.println("연산오류 !");
				}
				
			}
		}
		
			
	}
}
