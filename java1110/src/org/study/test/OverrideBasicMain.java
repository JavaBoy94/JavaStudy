package org.study.test;

import java.util.Scanner;

public class OverrideBasicMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("쿼리문 입력 : ");
		String Str = input.next();
	
		System.out.println();
		
//		ActionQueryInsert insert = new ActionQueryInsert();
//		ActionQueryUpdate update = new ActionQueryUpdate();
//		ActionQueryDelete delete = new ActionQueryDelete();
//		ActionQuerySelect select = new ActionQuerySelect();
		
		// 다형성
		OverrideBasic action;  // 부모타입의 참조변수 선언
	
		if (Str.equals("insert")) {
			action = new ActionQueryInsert();   // 부모타입으로 자식타입 객체 참조  => 객체의 타입이 부모타입이기 때문에 부모로부터 상속받은 메소드(오버라이드한 메소드)만 사용가능                                                                                                               
			action.executeQuery();
		} else if (Str.equals("update")) {
			action = new ActionQueryUpdate();
			action.executeQuery();
		} else if (Str.equals("delete")) {
			action = new ActionQueryDelete();
			action.executeQuery();
		} else if (Str.equals("select")) {
			action = new ActionQuerySelect();
			action.executeQuery();
		} else {
			System.out.println("입력오류!");
		}
			
	}
}
