package org.study.conditionEx;

import java.util.Scanner;

public class Ifex01 {

	public static void main(String[] args) {
		
		System.out.println("조건이 하나일 때  ex)아이디 체크");
		
		String id = "m111";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userId = input.next();
		
		if (userId.equals(id)) {
			System.out.println("이미 존재하는 아이디입니다.");
		}
		
		if (!userId.equals(id)) {                       // !(부정) 연산 사용
			System.out.println("사용가능한 아이디입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
	}
}
