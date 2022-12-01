package org.study.controller;

import java.util.Scanner;

import org.study.commend.DBCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {
// 입력받은 쿼리문에 맞는 작업을 commend에 명령
	public static void main(String[] args) {
		
		System.out.println("--CRUD 실행--");
		
		Scanner input = new Scanner(System.in);
		
		
		DBCommend commend = null;
		
		while (true) {
			System.out.println("쿼리문 입력 (insert, select, update, delete) / 종료(exit)");
			String query = input.next();
			
			if (query.equals("exit")) {
				System.out.println("CRUD 종료 !");
				break;
			} else if (query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else {
				System.out.println("입력 오류!");
			}
		}
	}
}
