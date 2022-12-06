package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController3 {

	public static void main(String[] args) {
		
		// 스캐너 이용하여 아이디, 비밀번호, 이메일, 나이 입력
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<MemberDto> users = new ArrayList<>();
		
		users.add(new MemberDto("m1", "11", "m1@naver.com", 20));
		
		String userId = users.get(0).getUserId();
		String userPw = users.get(0).getUserPw();
		
		System.out.print("아이디 입력 : ");
		String id = input.next();
		
		System.out.print("비밀번호 입력 : ");
		String pw = input.next();
		
		if (userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공 !");
		} else {
			System.out.println("로그인 실패 !");
		}

		
		
	}
}
