package org.study.oop;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class MemberController {

	public static void main(String[] args) {
		
		// 스캐너로 회원가입 만들기
		// 회원정보를 콘솔에 출력
		// while(true), if~break 사용
		// exit 입력되면 while문 종료
		
		MemberDTO member = new MemberDTO();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("==회원가입==");
		System.out.println("회원가입을 할까요? (y/n)");
		String m = input.next();
		if (m.equals("n")) {
			System.out.println("회원가입을 종료합니다");
			input.close();
		} else if (m.equals("y")) {
			while (true) {
				System.out.print("아이디 입력 : ");
				member.setUserId(input.next());
				
				System.out.print("비밀번호 입력 : ");
				member.setUserPw(input.next());
				
				System.out.print("나이 입력 : ");
				member.setAge(input.nextInt());
				
				System.out.println("---------회원가입 정보---------");
				System.out.println("ID: "+member.getUserId());
				System.out.println("PW: "+member.getUserPw());
				System.out.println("Age: "+member.getAge());
			
				System.out.println("계속 회원가입을 할까요? (y/n)");
				String n = input.next();
				
				if (n.equals("n")) {
					System.out.println("회원가입을 종료합니다");
					input.close();
					break;
				}
			}
		} else {
			System.out.println("입력이 올바르지 않습니다!");
		}
	}
}
