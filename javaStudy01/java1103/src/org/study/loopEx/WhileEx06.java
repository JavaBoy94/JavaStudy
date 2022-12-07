package org.study.loopEx;

import java.util.Scanner;

public class WhileEx06 {

	public static void main(String[] args) {
		
		System.out.println("==while(true)==");
		
		// 로그인 프로그램 만들기
		// while(true) 이용하여 id,pw가 일치하면 while문 종료 (로그인 성공)
		// 일치하지 않으면 계속 입력 (로그인 실패)
		// while, if, break 사용
		
		String dbId = "root";
		String dbPw = "1111";
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("아이디 입력 : ");
			String userId = input.next();

			System.out.print("비밀번호 입력 : ");
			String userPw = input.next();
			
			if (userId.equals(dbId)&&userPw.equals(dbPw)) {
				System.out.println("로그인 성공!");
				break;
			} else if (userId.equals(dbId)&&!userPw.equals(dbPw)) {
				System.out.println("로그인 실패 : 비밀번호를 확인해주세요.");
			} else {
				System.out.println("로그인 실패 : 존재하지 않는 아이디입니다.");
			}
		}
		input.close();
	}
}
