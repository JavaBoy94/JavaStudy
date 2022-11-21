package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		
		Vector<String> v0 = new Vector<>();
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		// Iterator 사용
		Iterator<String> iter = v0.iterator();
		while (iter.hasNext()) {
			String el = iter.next();
			System.out.print(el+" ");
		}
		
		System.out.println();
		
		// 사용자정의 타입 응용 => 벡터에 지역변수를 갖는 객체 추가
		Vector<MemberDto> Dto = new Vector<MemberDto>();
		Dto.add(new MemberDto("userId1", "userPw1", "userName1", 29));
		Dto.add(new MemberDto("userId2", "userPw2", "userName2", 23));
		Dto.add(new MemberDto("userId3", "userPw3", "userName3", 54));
		Dto.add(new MemberDto("userId4", "userPw4", "userName4", 12));
		Dto.add(new MemberDto("userId5", "userPw5", "userName5", 25));
		System.out.println("벡터 길이 : "+Dto.size());
		System.out.println("벡터 용량 : "+Dto.capacity());
		
		System.out.println();
		
		// for문으로 벡터요소 출력
		for (int i=0; i<Dto.size(); i++) {
			System.out.print("아이디 : "+Dto.get(i).getUserId());  
			System.out.print(" 비밀번호 : "+Dto.get(i).getUserPw());  
			System.out.print(" 이름 : "+Dto.get(i).getUserName());  
			System.out.println(" 나이 : "+Dto.get(i).getAge());  
		}
		
		System.out.println();
		
		// foreach문으로 벡터요소 출력
		for (MemberDto users : Dto) {
			System.out.print("아이디 : "+users.getUserId());  
			System.out.print(" 비밀번호 : "+users.getUserPw());  
			System.out.print(" 이름 : "+users.getUserName());  
			System.out.println(" 나이 : "+users.getAge());  
		}
		
		System.out.println();
		
		// iterator로 벡터요소 출력
		Iterator<MemberDto> iter2 = Dto.iterator();
		while (iter2.hasNext()) {
			MemberDto dto = iter2.next();
			System.out.print("아이디 : "+dto.getUserId());  
			System.out.print(" 비밀번호 : "+dto.getUserPw());  
			System.out.print(" 이름 : "+dto.getUserName());  
			System.out.println(" 나이 : "+dto.getAge());  
		}
	}
}
