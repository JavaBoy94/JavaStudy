package org.study.operatorEx;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		
		System.out.println("비교연산자");
		
//		int num1 = 10;
//		int num2 = 20;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scn.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = scn.nextInt();
		
		System.out.println("==비교연산 결과==");
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		// ==
		
		System.out.println("==조건문(if문)==");
		
		if (num1>10) {
			System.out.println("num1은 10보다 큽니다.");
		} else {
			System.out.println("num1은  10보다 작습니다!");
		}
		
		if (num2>10) System.out.println("num2는 10보다 큽니다.");
		else System.out.println("num2는 10보다 작습니다.");
		
		
		int age = 11;
		String strAge = "11";

//		System.out.println(age==strAge);               // 숫자와 문자열의 비교연산은 불가능
		System.out.println(strAge.equals("11"));    // 문자열 객체의 비교연산은 equals 사용
		scn.close();
	}
}
