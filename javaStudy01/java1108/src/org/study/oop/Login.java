package org.study.oop;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		// setter, getter, 스캐너 이용 로그인
		// 저장 userId="m11, userPw="1111"
		// id, pw가 같으면 "로그인 성공"
		// id, pw가 다르면 "로그인 실패" 콘솔에 출력
		// 로그인 실행 안하면 종료

		// 저장정보
		String userId = "m11";
		String userPw = "1111";
		
		MemberDTO member = new MemberDTO();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("로그인을 하시겠습니까? (y/n) : ");
			String l = input.next();

			if (l.equals("n")) {
				System.out.println("로그인을 종료합니다");
				input.close();
				break;
			} else if (l.equals("y")) {
				while (true) {
					System.out.print("아이디 입력 : ");
					member.setUserId(input.next());
					String id = member.getUserId();

					System.out.print("비밀번호 입력 : ");
					member.setUserPw(input.next());
					String pw = member.getUserPw();

					if (id.equals(userId) && pw.equals(userPw)) {
						System.out.println("로그인 성공! 즐거운 쇼핑되세요~");
						input.close();
						break;
					} else if (!id.equals(userId)) {
						System.out.println("등록되지 않은 아이디입니다.");
					} else if (id.equals(userId) && !pw.equals(userPw)) {
						System.out.println("비밀번호를 확인해주세요.");
					}
				}
				break;
			} else {
				System.out.println("입력이 올바르지 않습니다!");
			}
		}
	}
}
