package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDeleteDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("삭제할 아이디 입력 : ");
			String userId = input.next();
			
			System.out.println(userId);
			System.out.println("정말 탈퇴하시겠습니까? (y/n)");
			String yn = input.next();
			
			if (yn.equals("y")) {
				MemberDao dao = new MemberDao();
				
				int result = dao.delete(userId);
				
				if (result==1) {
					System.out.println("회원탈퇴 완료 !");
					break;
				} else {
					System.out.println("회원탈퇴 실패 !");
				}
				
			} else if (yn.equals("n")) {
				continue;
			} else {
				System.out.println("입력 오류 !");
			}
			
		}
		
		
		
		
	}

}
