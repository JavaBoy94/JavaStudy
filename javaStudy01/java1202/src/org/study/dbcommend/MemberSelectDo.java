package org.study.dbcommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("select");
		
		Scanner input = new Scanner(System.in);
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
			
		
		while (true) {
			System.out.println("회원조회 : user / 전체회원 조회 : users");
			String select = input.next();
			
			if (select.equals("users")) {
				
				MemberDao dao = new MemberDao();
				
				lists = dao.selectAll();
				
				System.out.println("ID\tPW\tAGE\tEMAIL");
				System.out.println("-----------------------------------");
				
				if (lists!=null) {
					for (MemberDto users : lists) {
						System.out.print(users.getUserId()+"\t");
						System.out.print(users.getUserPw()+"\t");
						System.out.print(users.getAge()+"\t");
						System.out.println(users.getEmail());
					}
					System.out.println();
					System.out.println("전체회원 조회 완료 !");
					
				} else {
					System.out.println("회원조회 실패 !");
				}
				break;
				
			} else if (select.equals("user")) {
				System.out.print("조회할 ID 입력 : ");
				String userid = input.next();
						
				System.out.print("PW 입력 : ");
				String userpw = input.next();
				
				MemberDao dao = new MemberDao();
				
				lists = dao.select(userid);

				if (lists.size()!=0) {
					System.out.println("ID\tPW\tAGE\tEMAIL");
					System.out.println("----------------------------------");
					for (MemberDto user : lists) {
						System.out.print(user.getUserId()+"\t");
						System.out.print(user.getUserPw()+"\t");
						System.out.print(user.getAge()+"\t");
						System.out.println(user.getEmail());
					}
					System.out.println();
					System.out.println("회원("+userid+") 조회 완료 !");
				} else if (lists.size()==0) {
					System.out.println("존재하지 않는 ID 입니다 !");
					continue;
				}
			} else {
				System.out.println("회원조회 실패 !");
			}
			break;
		}
		
		
		
	}

}
