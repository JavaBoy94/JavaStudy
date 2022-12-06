package org.study.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.study.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		// ArrayList 객체 생성. 요소는 MemberDto
		ArrayList<MemberDto> lists = new ArrayList<>();
		
		// lists에 요소 5개 추가 (Id 중복 불가)
		// for, foreach문 출력
		// 아이디:~, 비밀번호:~, 이메일:~, 나이:~
		
		lists.add(new MemberDto("m1", "1111", "m1@naver.com", 11));
		lists.add(new MemberDto("m2", "1112", "m2@naver.com", 22));
		lists.add(new MemberDto("m3", "1113", "m3@naver.com", 33));
		lists.add(new MemberDto("m4", "1114", "m4@naver.com", 44));
		lists.add(new MemberDto("m5", "1115", "m5@naver.com", 55));
		
		System.out.println("--for--");
		
		for (int i=0; i<lists.size(); i++) {
			System.out.print("아이디 : "+lists.get(i).getUserId());
			System.out.print(" / 비밀번호 : "+lists.get(i).getUserPw());
			System.out.print(" / 이메일 : "+lists.get(i).getEmail());
			System.out.print(" / 나이 : "+lists.get(i).getAge());
			System.out.println();
		}
		
		System.out.println("--foreach--");
		
		for (MemberDto users : lists) { 
			System.out.print("아이디 : "+users.getUserId());
			System.out.print(" / 비밀번호 : "+users.getUserPw());
			System.out.print(" / 이메일 : "+users.getEmail());
			System.out.print(" / 나이 : "+users.getAge());
			System.out.println();
		}
	
		System.out.println("--foreach reverse--");
		
		Collections.reverse(lists);
		
		for (MemberDto users : lists) { 
			System.out.print("아이디 : "+users.getUserId());
			System.out.print(" / 비밀번호 : "+users.getUserPw());
			System.out.print(" / 이메일 : "+users.getEmail());
			System.out.print(" / 나이 : "+users.getAge());
			System.out.println();
		}
	}
}
