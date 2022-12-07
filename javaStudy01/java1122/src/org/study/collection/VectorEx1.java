package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector<Integer> v0 = new Vector<>();
		
		v0.add(10);
		v0.add(20);
		v0.add(30);
		v0.add(40);
		v0.add(50);
		
		for (int a : v0) {
			System.out.println(a);
		}
		
		Vector<MemberDto> users = new Vector<>();
		
//		MemberDto user1 = new MemberDto("m1", "1111", "name1", 11);
//		MemberDto user2 = new MemberDto("m2", "1112", "name2", 22);
//		MemberDto user3 = new MemberDto("m3", "1113", "name3", 33);
//		MemberDto user4 = new MemberDto("m4", "1114", "name4", 44);
//		MemberDto user5 = new MemberDto("m5", "1115", "name5", 55);
//		
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		users.add(user5);
		
		users.add(new MemberDto("m1", "1111", "name1", 11));
		users.add(new MemberDto("m2", "1112", "name2", 22));
		users.add(new MemberDto("m3", "1113", "name3", 33));
		users.add(new MemberDto("m4", "1114", "name4", 44));
		users.add(new MemberDto("m5", "1115", "name5", 55));
		
		System.out.println(users.size());
		System.out.println(users.capacity());
		System.out.println();
		
		System.out.println("-----foreach-----");
		
		for (MemberDto a : users) {
			System.out.println("아이디 : "+a.getUserId());
			System.out.println("비밀번호 : "+a.getUserPw());
			System.out.println("이름 : "+a.getUserName());
			System.out.println("나이 : "+a.getAge());
			System.out.println();
		}
		
		System.out.println("----Iterator-----");	
		// Iterator 객체 생성
		Iterator<MemberDto> iter1 = users.iterator();
		
		while (iter1.hasNext()) {   // while로 iter1의 모든 요소 출력
			MemberDto user =  iter1.next();  // 다음 요소가 있으면 변수에 저장
			System.out.println("아이디 : "+user.getUserId());
			System.out.println("비밀번호 : "+user.getUserPw());
			System.out.println("이름 : "+user.getUserName());
			System.out.println("나이 : "+user.getAge());
			System.out.println();
		}
		
	}
}
