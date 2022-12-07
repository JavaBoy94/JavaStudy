package org.study.dbcontroller;

import java.util.Scanner;

import org.study.dbcommend.DBCommend;
import org.study.dbcommend.MemberDeleteDo;
import org.study.dbcommend.MemberInsertDo;
import org.study.dbcommend.MemberSelectDo;
import org.study.dbcommend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		
		System.out.println("--CRUD--");
		
		Scanner input = new Scanner(System.in);
		
		DBCommend comm = null;
		
		
		while (true) {
			System.out.println();
			System.out.println("쿼리문 입력 (insert, select, update, delete) / 종료(exit) ");
			String query = input.next();
			
			if (query.equals("exit")) {
				System.out.println("종료 !");
				input.close();
				break;
			} else if (query.equals("insert")) {
				comm = new MemberInsertDo();
				comm.excuteQueryCommend();
			} else if (query.equals("select")) {
				comm = new MemberSelectDo();
				comm.excuteQueryCommend();
			} else if (query.equals("update")) {
				comm = new MemberUpdateDo();
				comm.excuteQueryCommend();
			} else if (query.equals("delete")) {
				comm = new MemberDeleteDo();
				comm.excuteQueryCommend();
			} else {
				System.out.println("입력오류 !");
			}
		}
		
		
		
		
		
		
	}
}
