package org.study.test;

import java.util.Scanner;

public class OverrideBasicMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("가입할 회원명 입력 : ");
		String Str1 = input.next();
		
		System.out.print("수정할 회원명 입력 : ");
		String Str2 = input.next();
		
		System.out.print("탈퇴할 회원명 입력 : ");
		String Str3 = input.next();
		
		System.out.print("조회할 회원명 입력 : ");
		String Str4 = input.next();
		
		System.out.println();
		
		ActionQueryInsert insert = new ActionQueryInsert();
		ActionQueryUpdate update = new ActionQueryUpdate();
		ActionQueryDelete delete = new ActionQueryDelete();
		ActionQuerySelect select = new ActionQuerySelect();
		
//		insert.executeQuery();
//		update.executeQuery();
//		delete.executeQuery();
//		select.executeQuery();
		
		insert.executeQuery(Str1);
		update.executeQuery(Str2);
		delete.executeQuery(Str3);
		select.executeQuery(Str4);
	}
}
