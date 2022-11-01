package org.study.operatorEx;

import java.util.Scanner;

public class Operator09 {

	public static void main(String[] args) {
		
		System.out.println("비트연산자");
		
		// 비트연산자는 10진수를 2진수로 변환하여 처리함.
		System.out.println(1&1);
		System.out.println(1&0);
		System.out.println(0&1);
		System.out.println(0&0);
		System.out.println(10&12);     //  10&12 => 1010&1100 => 1000 => 8
		System.out.println(10|12);     //  10|12 => 1010|1100 => 1110 => 14
		System.out.println(10^12);     //  10^12 => 1010^1100 => 0110 => 6
		System.out.println(~10);       //   ~10  => ~0 000000 00000000 00000000 00001010 => 1 1111111 11111111 11111111 11110101 => -11
		
		// Wrapper - 정수의 값을 2진수의 문자열로 반환
		System.out.println(Integer.toBinaryString(10&12));   
		System.out.println(Integer.toBinaryString(10|12));  
		System.out.println(Integer.toBinaryString(10^12));   
		System.out.println(Integer.toBinaryString(~10));     
		
		int i1 = 10;
		int i2 = 0b111;    // 2진수
		int i3 = 0111;     // 8진수
		int i4 = 0xaaa;    // 16진수
		
		System.out.println(" i1 = "+i1+" / i2 = "+i2+" / i3 = "+i3+" / i4 = "+i4);
		System.out.println("===========================");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = input.nextInt();
		
		System.out.print("연산자 입력 (&, |, ^, ~) : ");
		String op = input.next();
		
		if (op.equals("&")) {
			System.out.println("& 연산값 : "+(num1&num2));
			String binary = Integer.toBinaryString(num1&num2);
			System.out.println("binary값 : "+binary);
		} else if (op.equals("|")) {
			System.out.println("| 연산값 : "+(num1|num2));
			String binary = Integer.toBinaryString(num1^num2);
			System.out.println("binary값 : "+binary);
		} else if (op.equals("^")) {
			System.out.println("^ 연산값 : "+(num1^num2));
			String binary = Integer.toBinaryString(num1^num2);
			System.out.println("binary값 : "+binary);
		} else if (op.equals("~")) {
			String binary1 = Integer.toBinaryString(num1);
			String binary2 = Integer.toBinaryString(num2);
			System.out.println("num1 binary값 : "+binary1+", num2 Binary값 : "+binary2);
			System.out.println("~num1 연산값 : "+(~num1)+", ~num2 연산값 : "+(~num2));
		} else {
			System.out.println("연산이 올바르지 않습니다 !");
		}
		
		
		
		
		
	}
}
