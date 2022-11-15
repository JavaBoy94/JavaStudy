package org.study.BasicPackage;

public class StringEx1 {

	public static void main(String[] args) {
		
		System.out.println("String");
		
		String str01 = "java2022";             // 리터럴 방식
		String str02 = new String("java2022"); // new 방식

		char[] ch = {'j','a','v','a','2','0','2','2'};
		String str03 = new String(ch);         // char배열 이용
		
		String str1 = "java2022";  // 문자열 리터럴
		String str2 = "java2022";  // JVM 리터럴 테이블 (공유)
		
		System.out.println(str1 == str2);        // 객체비교
		System.out.println(str1.equals(str2));   // 값(=> 주소값)을 비교
		
		// new 방식으로 객체를 만들경우 힙에 저장 => 같은 자료를 넣어도 힙 안에서 각각의 객체의 주소가 다름
		String str3 = new String("java2022");    // 힙에 저장  
		String str4 = new String("java2022");    // 힙에 저장
		
		System.out.println(str3 == str4);        // 객체비교  >> false (힙 안에서 두 객체가 별도의 공간에 할당되기 때문)
		System.out.println(str3.equals(str4));   // 값(주소값) 비교 >> true (객체에 들어간 주소값이 동일)
		
		
	}
}
