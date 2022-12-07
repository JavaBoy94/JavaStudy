package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.DBQueryCommend;
import org.study.Commend.MemberDeleteCommend;
import org.study.Commend.MemberInsertCommend;
import org.study.Commend.MemberSelectCommend;
import org.study.Commend.MemberUpdateCommend;

public class MemberController {

	public static void main(String[] args) {

		// 스캐너 이용하여 회원관리 프로그램만들기
		// Query가 insert면 회원가입 Commend 출력
		// Query가 delete면 회원탈퇴 Commend 출력
		// Query가 update면 회원수정 Commend 출력
		// Query가 select면 회원조회 Commend 출력
		// 그외 => 입력오류 출력
		// while(True)로 계속 돌아가다가 exit를 입력하면 종료
		// 다형성 이용하여 부모타입(DBQueryCommend)의 참조변수 이용
		// 상속을 통해 부모타입의 메소드를 자식객체에서 오버라이드하여 구현

		String Query = "";

		Scanner input = new Scanner(System.in);

		DBQueryCommend member;

		while (true) {
			System.out.print("회원관리 프로그램을 실행시겠습니까? (y/n) : ");
			String yn = input.next();

			if (yn.equals("n")) {
				System.out.println("회원관리 프로그램을 종료합니다.");
				input.close();
				break;
			} else if (yn.equals("y")) {
				while (true) {
					System.out.print("쿼리문 입력 (종료:n) : ");
					Query = input.next();
					if (Query.equals("n")) {
						System.out.println("회원관리 프로그램을 종료합니다.");
						input.close();
						break;
					} else if (Query.equals("insert")) {
						member = new MemberInsertCommend();
						member.excuteQueryCommend();
					} else if (Query.equals("delete")) {
						member = new MemberDeleteCommend();
						member.excuteQueryCommend();
					} else if (Query.equals("update")) {
						member = new MemberUpdateCommend();
						member.excuteQueryCommend();
					} else if (Query.equals("select")) {
						member = new MemberSelectCommend();
						member.excuteQueryCommend();
					} else {
						System.out.println("쿼리 오류!");
					}
				}
			} else {
				System.out.println("입력이 올바르지 않습니다!");
				continue;
			}
			input.close();
			break;
		}
	}
}
