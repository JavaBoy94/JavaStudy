package org.study.BasicPackage;

import java.util.Scanner;

public class StringTokenizerQuiz1 {

	public static void main(String[] args) {
		
		// String 타입의 변수 userId, userPw, userName
		// 스캐너 이용하여 초기화
		// concat 활용 
		// userId=m111&userPw=1111&userName=s1111 형태로 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Id 입력 : ");
		String userId = input.next();
		String userId2 = "userId=".concat(userId);
		System.out.println(userId2);
		
		System.out.print("Pw 입력 : ");
		String userPw = input.next();
		String userpw2 = "userPw=".concat(userPw);
		System.out.println(userpw2);
		
		System.out.print("Name 입력 : ");
		String userName = input.next();
		String userName2 = "userName=".concat(userName);
		System.out.println(userName2);
		
		System.out.println("-------------------");
		
		String user = userId2.concat("&").concat(userpw2).concat("&").concat(userName2);
		System.out.println(user);
				
	}
}
