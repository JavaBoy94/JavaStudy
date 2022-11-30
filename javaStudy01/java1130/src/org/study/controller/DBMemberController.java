package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class DBMemberController {
	// controller 
	// 1. 클라이언트로부터 요청(Request) 수신
	// 2. 요청에 대한 작업을 Commend에 명령 
	// 3. 작업의 결과인 반환값 도출
	// 4. 반환값을  View로 응답(Response)
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String query = "";
		
		while (true) {
			System.out.println("SQL문 입력 (Insert, Select, Update, Delete) / 종료(exit)");
			query=input.next();
			MemberCommend commend;
			
			if (query.equals("insert")) {
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
			} else if (query.equals("exit")) {
				System.out.println("종료 !");
				break;
			} else {
				System.out.println("입력오류 !");
			}
			
			System.out.println();
		}
		
		
	}
}
