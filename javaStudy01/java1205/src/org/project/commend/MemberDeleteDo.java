package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("탈퇴할 ID 입력 : ");
			String userid = input.next();
			
			System.out.println("정말 탈퇴하시겠습니까? (y/n)");
			String yn = input.next();
			
			if (yn.equals("n")) {
				continue;
			} else if (yn.equals("y")) {
				MemberDao dao = new MemberDao();
				dao.delete(userid);
				break;
			} else {
				System.out.println("입력 오류 !");
			}
		}
		
	}

}
