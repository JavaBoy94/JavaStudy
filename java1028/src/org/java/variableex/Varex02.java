package org.java.variableex;

public class Varex02 {

		public static void main(String[] args) {
			
			System.out.println("-자바의 객체형 타입-");
			
			             // 객체 생성 >> 주소값(임의값)
			String str1 = new String();  // String(문자열)의 주소만 생성 (실제 데이터값은 아직 넣지 않은 상태)
			str1 = "문자열 data";          // 생성된 객체(주소)에 데이터 부여   
			
			String str2 = "문자열2 data";  // new 생략 가능
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println();        // 공백으로출력시 한줄 띄우기 가능
			System.out.println(str2.length());   // String 클래스이므로, String 클래스의 메소드(.) 사용가능
			
			// BasicClass(사용자정의타입) 객체 생성
			BasicClass class1 = new BasicClass();
			System.out.println(class1.userId);  // BasicClass 클래스의 userId 메소드 사용
			System.out.println(class1.userPw);  // BasicClass 클래스의 userPw 메소드 사용
		}
}
