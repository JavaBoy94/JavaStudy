package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.CRUDCommend;
import org.study.Commend.DBDelete;
import org.study.Commend.DBInsert;
import org.study.Commend.DBSelect;
import org.study.Commend.DBUpdate;

public class MemberController {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		
		while(bool) {
			System.out.print("쿼리문입력 : ");
			String query = input.next();
			
			CRUDCommend commend = null;
			
			if (query.equals("insert")) {
				commend = new DBInsert();
				commend.excuteCommend();
			} else if (query.equals("delete")) {
				commend = new DBDelete();
				commend.excuteCommend();
			} else if (query.equals("update")) {
				commend = new DBUpdate();
				commend.excuteCommend();
			} else if (query.equals("select")) {
				commend = new DBSelect();
				commend.excuteCommend();
			} else if (query.equals("exit")) {
				System.out.println("프로그램 종료!");
				input.close();
//				break;
				bool = false;
			} else {
				System.out.println("입력 오류!");
			}
		}
		
		
	}
}
