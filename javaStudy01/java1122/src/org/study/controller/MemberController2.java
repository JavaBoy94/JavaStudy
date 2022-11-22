package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController2 {

	public static void main(String[] args) {
		
		// 스캐너 이용하여 아이디, 비밀번호, 이메일, 나이 입력
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<MemberDto> users = new ArrayList<>();
		
		while (true) {
			System.out.print("회원정보를 입력할까요? (y/n)");
			String yn = input.next();
			
			if (yn.equals("n")) {
				System.out.println("프로그램 종료 !");
				input.close();
				break;
			} else if (yn.equals("y")) {
				System.out.print("아이디 입력 : ");
				String id = input.next();
				
				System.out.print("비밀번호 입력 : ");
				String pw = input.next();
				
				System.out.print("이메일 입력 : ");
				String email = input.next();
				
				System.out.print("나이 입력 : ");
				int age = input.nextInt();
				
				users.add(new MemberDto(id, pw, email, age));
				
				
			} else {
				System.out.println("입력이 올바르지 않습니다!");
				continue;
			}
		}
		System.out.println();
		System.out.println("==User List==");
		System.out.println("userId\tuserPw\temail\tuserAge");
		System.out.println("---------------------------------");
		
		for (MemberDto member : users) {
			System.out.print(member.getUserId()+"\t");
			System.out.print(member.getUserPw()+"\t");
			System.out.print(member.getEmail()+"\t");
			System.out.print(member.getAge()+"\t");
			System.out.println();
		}
		
		
		
	}
}
