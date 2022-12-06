package org.study.dbcommend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements DBCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("insert");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("추가할 ID 입력 : ");
		String userid = input.next();
		
		System.out.print("PW 입력 : ");
		String userpw = input.next();
		
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		System.out.print("이메일 입력 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		dao.insert(userid, userpw, age, email);
		
	}

	
}
