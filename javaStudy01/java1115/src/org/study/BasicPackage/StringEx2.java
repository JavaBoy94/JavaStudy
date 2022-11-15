package org.study.BasicPackage;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {

		System.out.println("String");

		// String 생성방법
		String str1 = "java2022";
		String str2 = new String("java2022");
		char[] ch = { 'j', 'a', 'v', 'a', '2', '0', '2', '2' };
		String str3 = new String(ch);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("== String 주요 메소드 ==");

		String strTest1 = "java 2022 Project";
		int size = strTest1.length();
		System.out.println("문자열 길이 : " + size);

		for (int i = 0; i < strTest1.length(); i++) {
			System.out.println(strTest1.charAt(i));
		}

		System.out.println();

		char strTest1Ch = strTest1.charAt(5);
		System.out.println(strTest1Ch);
		System.out.println(strTest1.codePointAt(5));

		String s1 = "java";
		String s2 = "oracle";

		System.out.println(s1.compareTo(s2)); // s1의 문자열이 s2의 문자열보다 사전적 순서로 5만큼 먼저 나옴
		System.out.println("m1".compareTo("m1")); // 두 스트링의 사전적 순서가 같음
		System.out.println(s2.compareTo(s1)); // s2의 문자열이 s1의 문자열보다 사전적 순서로 5만큼 뒤에 나옴

		System.out.println(s1.concat(s2)); // s1 문자열 뒤에 s2 문자열을 붙임
		System.out.println(s1 + "\t" + s2); // concat 후에도 원본은 그대로

		System.out.println("m1234".contains("1")); // "m1234"에서 "1"이 포함되어 있는지 (true/false)

		String strTest2 = "java 2022 Project";

		System.out.println(strTest2.substring(4));
		System.out.println(strTest2.substring(4, 8)); // 4번째 인덱스부터 8번째 인덱스 앞(7번째 인덱스)까지만 추출

		System.out.println();

		System.out.println(strTest2.replace("2022", "2023")); // strTest2의 "2022"를 "2023"으로 변경
		System.out.println(strTest2); // replace 후에도 원본은 그대로

		String Phone = "010-1234-4567";

		String[] PhoneArr = Phone.split("-"); // Phone 문자열을 "-"을 기준으로 분리한 문자열들을 배열에 저장
		System.out.println(PhoneArr.length);

		for (int i = 0; i < PhoneArr.length; i++) {
			System.out.println(PhoneArr[i]);
		}

		// foreach문
		for (String s : PhoneArr) {
			System.out.println(s);
		}

		System.out.println("abcd".toUpperCase()); // "abcd"을 대문자로 바꿈
		System.out.println("ABCD".toLowerCase()); // "ABCD"를 소문자로 바꿈

		String java = " java 2022 Project ";
		System.out.println(java.trim()); // 좌우 양 끝의 공백 제거
		System.out.println(java); // trim 후에도 원본은 그대로
		System.out.println(java.length() + "\t" + java.trim().length()); // trim으로 제거된만큼 길이 수정

		// .do를 제외한 문자열만을 추출 => length 이용

		String query1 = "/insert.do";
		String query2 = "/delete.do";
		String query3 = "/update.do";
		String query4 = "/select.do";

		System.out.println(query1.substring(0, query1.length() - 3));
		System.out.println(query2.substring(0, query2.length() - 3));
		System.out.println(query3.substring(0, query3.length() - 3));
		System.out.println(query4.substring(0, query4.length() - 3));


	}
}
