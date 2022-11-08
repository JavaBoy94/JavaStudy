package org.study.oop;

public class ClassMain {

	public static void main(String[] args) {
		
		// 클래스 멤버 적용
		System.out.println(ClassBasic.PROJECTNAME);
		String classmember1=ClassBasic.PROJECTNAME;
		System.out.println(classmember1);
		
		ClassBasic.classMethod();
		
		// 인스턴스 멤버 적용
		
		// 인스턴스화
		ClassBasic c1 = new ClassBasic();   // ClassBasic : 사용자정의타입 / c1 : 객체참조변수(객체) / new : 객체생성(객체의 주소값 생성) / ClassBasic() : 생성자(constructor)
		
		// 인스턴스 멤버 초기화
		c1.age=20;
		c1.userName="ps";
		c1.userPw="1111";
		c1.instanceMethod();
		
		System.out.println("나이 : "+c1.age);
		System.out.println("이름 : "+c1.userName);
		System.out.println("비번 : "+c1.userPw);
 	}
}
