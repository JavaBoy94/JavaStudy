package org.project.controller;

import java.util.Scanner;

import org.project.commend.DBCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectAgeDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.dao.MemberDao;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DBCommend comm= null; 
		
		
		while (true) {
			System.out.println("CRUD 입력 / 종료 (exit)");
			String crud = input.next();
			
			if (crud.equals("exit")) {
				System.out.println("종료 !");
				input.close();
				break;
			} else if (crud.equals("insert")) {
				comm = new MemberInsertDo();
				comm.excuteQueryCommend();
			} else if (crud.equals("select")) {
				comm = new MemberSelectDo();
				comm.excuteQueryCommend();
			} else if (crud.equals("selectA30")) {
				comm = new MemberSelectAgeDo();
				comm.excuteQueryCommend();
			} else if (crud.equals("update")) {
				comm = new MemberUpdateDo();
				comm.excuteQueryCommend();
			} else if (crud.equals("delete")) {
				comm = new MemberDeleteDo();
				comm.excuteQueryCommend();
			} else {
				System.out.println("입력 오류 !");
			}
		}
		
	}
}
