package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx01 {

	public static void main(String[] args) {

		// id, pw를 scanner로 입력
		// id가 일치하면, "아이디가 일치합니다."
		// pw가 일치하면, "비밀번호가 일치합니다."
		// 콘솔에 출력하는 프로그램을 만들어보세요.
		// if문(조건1 > 2개), equals, System.out.print(), scanner 사용

		String userid = "m111";
		String userpw = "1111";

		Scanner scn = new Scanner(System.in);

		System.out.print("아이디 입력 : ");
		String id = scn.next();

		System.out.print("비밀번호 입력 : ");
		String pw = scn.next();

//		if(id.equals(userid)) {
//			System.out.println("아이디가 일치합니다.");
//		} else {
//			System.out.println("아이디를 확인해주세요.");
//		}
//		
//		if(pw.equals(userpw)) {
//			System.out.println("비밀번호가 일치합니다.");
//		} else {
//			System.out.println("비밀번호를 확인해주세요.");
//		}

		if (id.equals(userid) && pw.equals(userpw)) {
			System.out.println("아이디, 비밀번호가 일치합니다.");
		} else {
			System.out.println("아이디, 비밀번호를 확인해주세요.");
		}

		scn.close();

	}
}
