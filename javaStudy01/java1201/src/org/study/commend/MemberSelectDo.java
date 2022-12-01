package org.study.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements DBCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원목록 조회");
		
		Scanner input = new Scanner(System.in);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<MemberDto> lists = dao.select();
		
		if (lists!=null) {
			System.out.println("회원목록 조회 Ok !");
			
			// 리스트의 모든 요소 출력 => foreach
			System.out.println("ID\t"+"PW\t"+"AGE");
			System.out.println("--------------------");
			for (MemberDto list : lists) {
				System.out.println(list.getUserId()+"\t"+list.getUserPw()+"\t"+list.getAge());
			}
		} else {
			System.out.println("회원목록 조회 Fail !");
		}
	}

}
