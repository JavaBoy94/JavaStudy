package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {
		
		// while, ArrayList, 스캐너, MemberDto2 사용
		// 회원가입 : 아이디, 이메일, 전화번호, 나이 입력 후, 전체 회원 출력 (총 5명)
		// 로그인 성공 : ArrayList에 저장된 MemberDto2 요소의 userId, email이 같을때
		// 로그인 실패 : ArrayList에 저장된 MemberDto2 요소의 userId, email이 다를때

		// 회원가입
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<MemberDto2> list = new ArrayList<>();
		
		while (true) {
			System.out.println("회원관리 실행? (y/n)");
			String yn = input.next();
			
			if (yn.equals("n")) {
				System.out.println("프로그램 종료!");
				break;
			} else if (yn.equals("y")) {
				System.out.print("아이디 입력 : ");
				String id = input.next();
				
				System.out.print("이메일 입력 : ");
				String email = input.next();
				
				System.out.print("전화번호 입력 : ");
				String phone = input.next();
				
				System.out.print("나이 입력 : ");
				int age = input.nextInt();
				
				list.add(new MemberDto2(id, email, phone, age));
				
			} else {
				System.out.println("입력오류 !");
				continue;
			}
		}
		System.out.println("==회원목록==");
		for (MemberDto2 i : list) {
			System.out.print("아이디 : "+i.getUserId());
			System.out.print(" / 이메일 : "+i.getEmail());
			System.out.print(" / 전화번호 : "+i.getPhone());
			System.out.print(" / 나이 : "+i.getAge());
			System.out.println();
		}
		
		System.out.println();
//		System.out.println(list.size());
		
		System.out.println("==로그인== ");

				System.out.print("아이디 입력 :");
				String id = input.next();
				
				System.out.print("이메일 입력 :");
				String email = input.next();

				for (int i=0; i<list.size(); i++) {
					String userId = list.get(i).getUserId();
					String Email = list.get(i).getEmail();
					
					if (id.equals(userId) && email.equals(Email)) {
						System.out.println("로그인 성공 !");
						break;
					} else if (!id.equals(userId) || !email.equals(Email)) {
						System.out.println("로그인 실패 !");
						break;
					}
				}
		}
	}

