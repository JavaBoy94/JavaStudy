package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		Scanner input = new Scanner(System.in);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		while (true) {
			System.out.println("회원목록 조회 : list / 회원조회 : user");
			String select = input.next();
			
			if (select.equals("list")) {
				lists = dao.selectList();
				
				for (MemberDto dto : lists) {
					System.out.print(dto.getUserId()+"\t");
					System.out.print(dto.getUserPw()+"\t");
					System.out.print(dto.getAge()+"\t");
					System.out.println(dto.getEmail()+"\t");
				}
				System.out.println();
				System.out.println("회원목록 조회 완료 !");
				System.out.println();
				break;
			} else if (select.equals("user")) {
				System.out.print("ID 입력 : ");
				String userid = input.next();
				
				lists = dao.selectUser(userid);
				
				if (lists.size()!=0) {
					for (MemberDto dto : lists) {
						System.out.print(dto.getUserId()+"\t");
						System.out.print(dto.getUserPw()+"\t");
						System.out.print(dto.getAge()+"\t");
						System.out.println(dto.getEmail()+"\t");
						System.out.println();
					}
					System.out.println("회원("+userid+") 조회 완료 !");
					System.out.println();
					break;
				} else if (lists.size()==0) {
					System.out.println("존재하지 않는 회원입니다 !");
					continue;
				}
			} else {
				System.out.println("입력 오류 !");
			}
		}
	}

}
