package org.study.dbcommend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDeleteDo implements DBCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("delete");
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("삭제할 ID 입력 : ");
			String userid = input.next();
			
			System.out.print("PW 입력 : ");
			String userpw = input.next();
			
			System.out.print("정말 ID("+userid+")를 삭제할까요? (y/n)");
			String yn = input.next();
			
			if (yn.equals("y")) {
				MemberDao dao = new MemberDao();
				
				dao.delete(userid, userpw);
				break;
			} else if (yn.equals("n")) {
			} else {
				System.out.println("입력 오류 !");
			}
			
		}
	}

}
