package org.study.conditionEx;

import java.util.Scanner;

public class Ifex03 {

	public static void main(String[] args) {
		
		System.out.println("조건이 두개일때");
		
		// 아이디, 비밀번호를 입력받가 일치하면 로그인 성공
		// 하나라도 틀리면 로그인 실패
		
		String id = "m111";
		String Pw = "1111";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 입력 : ");
		String userPw = input.next();
		
		if (userId.equals(id) && userPw.equals(Pw)) {
			System.out.println("로그인 성공!");
		} else if (!userId.equals(id) && userPw.equals(Pw)) {
			System.out.println("아이디를 확인해주세요.");
		} else if (!userId.equals(id) && !userPw.equals(Pw)) {
			System.out.println("아이디, 비밀번호가 정확하지 않습니다.");
		} else {
			System.out.println("비밀번호가 올바르지 않습니다.");
		}
		
		// 간단하게 처리할 때
//		if (!userId.equals(id) || !userPw.equals(Pw)) {     // 논리합(||) 사용 => 아이디나 비밀번호 중 하나라도 틀릴 경우
//			System.out.println("아이디, 비밀번호를 확인해주세요.");
//		} else {
//			System.out.println("로그인 성공 !");
//		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
	}
}
