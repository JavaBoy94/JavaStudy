package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectAgeDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("30대 회원 출력");
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
//		System.out.print("시작나이 입력 : ");
//		int ageStart = input.nextInt();
//		
//		System.out.print("끝나이 입력 : ");
//		int ageEnd = input.nextInt();
		
		MemberDao dao = new MemberDao();
//		lists = dao.selectAge(ageStart, ageEnd);
		lists = dao.selectAge();
		
		for (MemberDto dto : lists) {
			System.out.print(dto.getUserId()+"\t");
			System.out.print(dto.getUserPw()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.println(dto.getEmail());
		}
		System.out.println();
		System.out.println("회원목록 조회 완료 !");
		System.out.println();
	}

}
