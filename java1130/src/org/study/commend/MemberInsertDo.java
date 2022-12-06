package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		// 1. DB에 접속 => Dao(DB Access Object) 객체 사용
		MemberDao dao = new MemberDao();
		
		// 2. userId, userPw, age를 DB테이블에 추가
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		int result = dao.insert(userId, userPw, age);
		
		System.out.println(result);
		
		
	}

}
