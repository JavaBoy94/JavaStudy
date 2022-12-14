package org.java.variableex;

public class Varex01 {

		public static void main(String[] args) {
			// 변수
			/*
			 * 1. 변수선언
			 * 2. 변수를 초기화 > 데이터를 추가
			 * 3. 변수를 메모리에 할당
			 *
			 */

			// 정수형
			byte b;    // byte 타입의 변수 b를 선언
			b = 10;    // 변수 b를 정수형 데이터 10으로 '초기화' >> 메모리 주소에 할당
		
			byte b2 = 50;  // byte타입의 변수 c를 10으로 초기화하여 메모리에 할당
			short s = 15; // short타입의 변수 s를 15로 초기화하여 메모리에 할당
			int i = 10;   // int타입의 변수 i를 10으로 초기화하여 메모리에 할당
			long l = 20;  // long타입의 변수 l을 20으로 초기화하여 메모리에 할당
			
			// 실수형
			float f = 1.1f;  // float타입 변수 f를 1.1로 초기화하려했으나, 미스매치 에러로 f추가 
			double d = 1.1;  // double타입 변수 d를 1.1로 초기화
			
			// 문자형
			char ch = 'a';   // char타입 변수 ch를 선언 후 'a'로 초기화
			
			// 논리형
			boolean bool = true; // boolean 타입 변수 bool 선언 후 true로 초기화
			boolean boole = false; // boolean 타입 변수 boole 선언 후 false로 초기화
			
			
			// 콘솔에 변수 출력 ( Ctrl + Alt + 방향키(아래)로 줄단위 복붙)
			System.out.println("자바 기본 자료형");
			System.out.println(b);
			System.out.println(l);
			System.out.println(s);
			System.out.println(b2);
			System.out.println(d);
			System.out.println(i);
			System.out.println(f);
			System.out.println(d);
			System.out.println(ch);
			System.out.println(bool);
			System.out.println(boole);
			
			
			String a = "hi";
			System.out.println(a+" Pilsoo is "+bool);
			System.out.println("double is "+d);
		}
}
