package org.study.dbcommend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements DBCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("update");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String userid = input.next();
		
		System.out.print("수정할 PW 입력 : ");
		String userpw = input.next();
		
		System.out.print("수정할 나이 입력 : ");
		int age = input.nextInt();
		
		System.out.print("수정할 이메일 입력 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		
		dao.update(userid, userpw, age, email);
		
		
	}

}
