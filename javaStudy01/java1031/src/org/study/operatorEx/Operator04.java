package org.study.operatorEx;

import java.util.Scanner;

public class Operator04 {

	public static void main(String[] args) {
		
		System.out.println("==, equals() 비교");
		// 문자열 비교 >> 문자열 객체의 "값"을 비교 
		
//		String str1 = new String();
//		str1 = "java";
		
//      축약형태 ↓↓↓
		
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = "java";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(55==55);
		
		System.out.println(str1==str2);       // false로 출력  >> ==는 값이 아닌, 주소(스택)를 비교하기 때문
		System.out.println("java"=="java");   // true로 출력  >> 주소가 같은 자기자신끼리 비교
		System.out.println("java"==str3);     // true로 출력  >> 둘의 주소가 같기 때문
		
		System.out.println("java".equals(str1));  // true로 출력 >> .equals()는 주소가 아닌, 값을 비교하기 때문
		System.out.println("java".equals(str2));  // true로 출력 >> .equals()는 주소가 아닌, 값을 비교하기 때문
		System.out.println("java".equals(str3));  // true로 출력 >> .equals()는 주소가 아닌, 값을 비교하기 때문
		
		// * 문자열은 객체(class)이기 때문에 ==가 아닌 .equals()로 비교연산한다.
	}

}
