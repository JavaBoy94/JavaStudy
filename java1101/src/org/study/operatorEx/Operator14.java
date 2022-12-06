package org.study.operatorEx;

import java.util.Scanner;

public class Operator14 {

	public static void main(String[] args) {

		System.out.println("아스키코드");

		char c1 = 'A';
		int c1_int = 'A';
		
		System.out.println(c1+", "+c1_int);
		System.out.println('a');
		System.out.println('A');
		System.out.println('a'+'A');
		System.out.println('z'+'Z');
		
		// char의 연산 > int
		System.out.println('a'+'A');   // a의 아스키코드 10진수값 : 97, A의 아스키코드 10진수값 : 65 => 162
		System.out.println('a'+26);
		
		// 연산결과를 char로 출력할 경우
		System.out.println((char)('a'+25));    // 'a'+25 => 97+25 => 122 => 'z'
		
		// 대문자를 소문자로 바꿀 경우 => 소문자와 대문자의 차이만큼의 10진수를 대문자에 더한 후, char로 변환
		System.out.println("대문자 => 소문자 ");
		System.out.println('A');
		System.out.println("대소문자 차이 : "+('a'-'A'));
		System.out.println('A'+32);
		System.out.println((char)('A'+32));
		System.out.println();
		
		// 소문자를 대문자로 바꿀 경우 => 소문자와 대문자의 차이만큼의 10진수를 소문자에 뺀 후, char로 변환
		System.out.println("소문자 => 대문자 ");
		System.out.println('a');
		System.out.println("대소문자 차이 : "+('a'-'A'));
		System.out.println('a'-32);
		System.out.println((char)('a'-32));
		System.out.println("=========================");
		
		System.out.print("대문자를 입력하세요(A~Z) : ");
		Scanner input = new Scanner(System.in);
		
		char ch = input.next().charAt(0);    // 입력한 문자열의 첫번째값(문자)만 추출
		
		System.out.println("ch => "+ch);
		System.out.println("ch => "+(ch+32));
		System.out.println("ch => "+(char)(ch+32));
		
	}
}
