package org.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Integer> lists = new ArrayList<>();

		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.add(40);
		lists.add(50);

		for (int i : lists) {
			System.out.println(i);
		}

		// 회원리스트 생성 및 출력
		Scanner input = new Scanner(System.in);
		ArrayList<MemberDto> users = new ArrayList<>();

//		users.add(new MemberDto("m1", "email1", "1111111111", 11));
//		users.add(new MemberDto("m2", "email2", "2222222222", 22));
//		users.add(new MemberDto("m3", "email3", "3333333333", 33));
//		users.add(new MemberDto("m4", "email4", "4444444444", 44));
//		users.add(new MemberDto("m5", "email5", "5555555555", 55));

		boolean bool = false;

		while (!bool) {
			System.out.println("회원관리 실행할까요? (y/n)");
			String yn = input.next();

			if (yn.equals("n")) {
				System.out.println("프로그램 종료!");
				System.out.println("회원리스트를 출력합니다");
				System.out.println();
				System.out.println("===UserList===");

				for (MemberDto user : users) {
					System.out.print("아이디 : " + user.getUserId());
					System.out.print(" 이메일 : " + user.getEmail());
					System.out.print(" 전화번호 : " + user.getPhone());
					System.out.print(" 나이 : " + user.getAge());
					System.out.println();
				}

				bool = true;
//				break;
			} else if (yn.equals("y")) {
				System.out.print("아이디 입력 : ");
				String id = input.next();

				System.out.print("이메일 입력 : ");
				String email = input.next();

				System.out.print("전화번호 입력 : ");
				String phone = input.next();

				System.out.print("나이 입력 : ");
				int age = input.nextInt();

				users.add(new MemberDto(id, email, phone, age));

			} else {
				System.out.println("입력 오류!");
				continue;
			}
		}

		// 로그인 (id, email 확인)
		boolean bool2 = false;
		while (!bool2) {
			System.out.print("아이디 입력 :");
			String id = input.next();

			System.out.print("이메일 입력 :");
			String email = input.next();
			
			boolean userId = users.contains(id);
			System.out.println(userId);
			boolean userEmail = users.contains(email);
			
			while (true) {
	
				if (userId==true && userEmail==true) {
					System.out.println("로그인 성공 !");
					bool2=true;
					break;
				} else {
					System.out.println("로그인 실패 !");
					break;
				}
			}
		}

	}
}
