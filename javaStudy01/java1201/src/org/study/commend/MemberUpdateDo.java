package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements DBCommend {
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String userId = input.next();
		
		System.out.print("변경 PW : ");
		String userPw = input.next();
		
		System.out.print("변경 나이 : ");
		int age = input.nextInt();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.update(userId, userPw, age);
		
		if (result!=1) {
			System.out.println("회원수정 실패 !");
		} else {
			System.out.println("회원수정 성공 !");
		}
		
	}
}
