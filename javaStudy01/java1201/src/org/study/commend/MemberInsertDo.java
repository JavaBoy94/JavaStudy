package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements DBCommend{
// 회원정보를 입력받아, Dao에서 세팅한 insert 메소드의 매개변수로 전달
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 입력 : ");
		String userPw = input.next();
		
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		MemberDao dao = new MemberDao();
		
		// Dao의 insert 메소드 반환값(결과)를 받음 (0: 실패, 1:성공)
		int result = dao.insert(userId, userPw, age);
		
		if (result!=1) {
			System.out.println("회원가입 실패 !");
		} else {
			System.out.println("회원가입 성공 !");
		}
	}

}
