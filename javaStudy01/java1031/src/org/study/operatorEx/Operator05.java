package org.study.operatorEx;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {

		System.out.println("조건연산자");

		String userId = "m111";
		String userPw = "1111";

		System.out.println(userId.equals("m111") && userPw.equals("1111"));
		System.out.println(userId.equals("m111") && userPw.equals("0000"));
		System.out.println(userId.equals("o111") && userPw.equals("1111"));
		System.out.println("=======================");

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("=======================");

		// 콘솔에 로그인 입출력
		// id와 pw가 동시에 일치하면 "로그인 성공 !" 출력, 그렇지 않으면 "로그인 실패 !"
		// scanner로 아이디 > id, 비밀번호 > pw 입력받기
		// userId, userPw가 동시에 일치하는 프로그램 만들기
		// &&, if/else 사용

		Scanner scn = new Scanner(System.in);

		System.out.print("아이디를 입력하세요. : ");
		String id = scn.next();

		System.out.print("비밀번호를 입력하세요. : ");
		String pw = scn.next();
		
//		if (id.equals(userid) && pw.equals(userpw)) {
//			System.out.println("아이디, 비밀번호가 일치합니다.");
//		} else {
//			System.out.println("아이디, 비밀번호를 확인해주세요.");
//		}

		
		if (id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공 !");
		} else if (!id.equals(userId) && pw.equals(userPw)) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else if (id.equals(userId) && !pw.equals(userPw)) {
			System.out.println("비밀번호가 틀립니다.");
		} else {
			System.out.println("로그인 실패 !");
		}

		scn.close();

	}
}
