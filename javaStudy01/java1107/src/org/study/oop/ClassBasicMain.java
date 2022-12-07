package org.study.oop;

public class ClassBasicMain {

// main 메소드  => 약속된 형태로 고정
// 접근지정자 static(클래스메소드) 반환타입 main(String[] args) 
	public static void main(String[] args) {
		
		// 만들어둔 클래스(ClassBasic)를 불러와 새로운 객체 생성 => 접근연산자(.)으로 클래스 멤버에 접근 가능
		// new : 객체생성연산자 => 새로운 객체의 메모리 공간 생성 => 인스턴스화(객체화)
		ClassBasic c1 = new ClassBasic();  	// c1 => 객체참조변수 (객체)
		
		c1.userId="m111";
		c1.userPw="1111";
		c1.age=20;
		
		System.out.println(c1);
		System.out.println(c1.getClass());          // getClass : c1이 참조하는 객체의 위치(경로)를 나타냄
		System.out.println("c1 id : "+c1.userId);
		System.out.println("c1 pw : "+c1.userPw);
		System.out.println("c1 age : "+c1.age);
		
		System.out.println("--------------------------");
		// ClassBsic 타입의 객체 추가생성
		// 객체참조변수명은 c2
		// userId = s111, userPw = 2222, age=30 으로 출력
		
		ClassBasic c2 = new ClassBasic();
		
		c2.userId="s111";
		c2.userPw="2222";
		c2.age=30;
		
		System.out.println(c2);
		System.out.println(c2.getClass());
		System.out.println("c2 id : "+c2.userId);
		System.out.println("c2 pw : "+c2.userPw);
		System.out.println("c2 age : "+c2.age);
	}
}
