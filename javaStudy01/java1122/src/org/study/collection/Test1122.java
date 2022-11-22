package org.study.collection;

// 일반 클래스 생성
class A {
	int a;
	String s1;
	int m1() {
		return 0;
	}
}

// 제네릭타입 클래스 생성
class G1<T> {
	T t1;
	T m1(T t2) {
		return t2;
	}
}

public class Test1122 {

	public static void main(String[] args) {
		
		// 제네릭타입의 객체 생성 (String)
		G1<String> g1 = new G1<>();
		g1.t1 = "aa";
		String m1 = g1.m1("String");
		
		// 제네릭타입의 객체 생성 (int => Integer)
		G1<Integer> g2 = new G1<>();
		g2.t1 = new Integer(10);
 		g2.t1 = 10;   // 자동박싱
 		
 		Integer i1 = g2.m1(new Integer(10));
 		int i2 = g2.m1(new Integer(20).intValue());  // 언박싱
 		int i3 = g2.m1(20);   // 자동언박싱
 		
 		
 		MemberDto user1 = new MemberDto("m1", "1111", "name1", 21);
 		MemberDto user2 = new MemberDto("m2", "1112", "name2", 22);
 		MemberDto user3 = new MemberDto("m3", "1113", "name3", 23);
 		MemberDto user4 = new MemberDto("m4", "1114", "name4", 24);
 		MemberDto user5 = new MemberDto("m5", "1115", "name5", 25);
 		
 		
 		System.out.println("--user1--");
 		System.out.println("아이디 : "+user1.getUserId());
 		System.out.println("비밀번호 : "+user1.getUserPw());
 		System.out.println("이름 : "+user1.getUserName());
 		System.out.println("나이 : "+user1.getAge());
 		System.out.println();
 		
 		System.out.println("--user2--");
 		System.out.println("아이디 : "+user2.getUserId());
 		System.out.println("비밀번호 : "+user2.getUserPw());
 		System.out.println("이름 : "+user2.getUserName());
 		System.out.println("나이 : "+user2.getAge());
 		System.out.println();
 		
 		System.out.println("--user3--");
 		System.out.println("아이디 : "+user3.getUserId());
 		System.out.println("비밀번호 : "+user3.getUserPw());
 		System.out.println("이름 : "+user3.getUserName());
 		System.out.println("나이 : "+user3.getAge());
 		System.out.println();
 		
 		System.out.println("--user4--");
 		System.out.println("아이디 : "+user4.getUserId());
 		System.out.println("비밀번호 : "+user4.getUserPw());
 		System.out.println("이름 : "+user4.getUserName());
 		System.out.println("나이 : "+user4.getAge());
 		System.out.println();
 		
 		System.out.println("--user5--");
 		System.out.println("아이디 : "+user5.getUserId());
 		System.out.println("비밀번호 : "+user5.getUserPw());
 		System.out.println("이름 : "+user5.getUserName());
 		System.out.println("나이 : "+user5.getAge());
 		System.out.println();
	}
}
