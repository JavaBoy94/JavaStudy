package org.study.operatorEx;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {

		System.out.println("조건연산자");

		String userId = "m111";
		String userPw = "1111";

		System.out.println(userId.equals("m111") || userPw.equals("1111"));
		System.out.println(userId.equals("m111") || userPw.equals("0000"));
		System.out.println(userId.equals("o111") || userPw.equals("1111"));
		System.out.println("=======================");

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=======================");
		
		System.out.println(!false);
		System.out.println(!true);
		
		Scanner scn = new Scanner(System.in);

		System.out.print("아이디를 입력하세요. : ");
		String id = scn.next();

		System.out.print("비밀번호를 입력하세요. : ");
		String pw = scn.next();
		
		// 아이디나 비밀번호 둘 중 하나라도 틀리면
		if (!id.equals(userId) || !pw.equals(userPw)) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}

		
	}
}
