package org.study.operatorEx;

import java.util.Scanner;

public class Operator07 {

	public static void main(String[] args) {

		System.out.println("조건연산자");

		System.out.println(" && ");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println(" || ");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println(" ^ ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		String userId = "m111";
		String userPw = "1111";
		
		System.out.println("===로그인===");
		System.out.println(userId.equals("m111"));
		System.out.println(userPw.equals("1111"));
		
		boolean bool1 = userId.equals("m111");
		boolean bool2 = userPw.equals("1111");
		
//		System.out.println(bool1 && bool2);      
//		System.out.println(bool1 || bool2);
//		System.out.println(!bool1 || bool2);
//		System.out.println(bool1 || !bool2);
//		System.out.println(!bool1 || !bool2);
//		System.out.println(bool1 ^ bool2);
//		System.out.println(!bool1 ^ bool2);
//		System.out.println(bool1 ^ !bool2);
		System.out.println(!bool1 ^ !bool2);
		
		
	}
}
