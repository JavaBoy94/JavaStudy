package org.study.operatorEx;

import java.util.Scanner;

public class Operator01 {
	
	public static void main(String[] args) {
		
		System.out.println("산술연산자");
		
//		int num1 = 10;
//		int num2 = 20;
//		
		// 숫자+숫자 >> 숫자
		// 숫자+"문자열" >> 문자열
		// ex) 10+"10" >> "1010"
		// ex) 10+"10"+10 >> "1010"+10 >> "101010"
		// ex) 10+10+"10" >> 20+"10" >> "2010"
		// ex) "10"+(10+10) >> "10"+20 >> "1020"
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 숫자(정수)를 받아서 산술연산을 하시오.");
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scn.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = scn.nextInt();
		
		System.out.println("==연산결과==");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));           // int 타입이므로 정수부분만 출력
		System.out.println(num1+" / "+num2+" = "+(num1/(double)num2));   // double로 캐스팅
		System.out.println(num1+" % "+num2+" = "+(num1%num2));   

		
	}
}
