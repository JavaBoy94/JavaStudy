package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.DBDeleteDo;
import org.study.Commend.DBInsertDo;
import org.study.Commend.DBSelectDo;
import org.study.Commend.DBUpdateDo;
import org.study.Commend.SQLQueryCommend;

public class DBControllerMain {

	public static void main(String[] args) {
		
		// 스캐너, while문으로 회원관리 프로그램 만들기
		
		// 다형성 적용하여 부모타입의 구현객체 인스턴스 만들기
		SQLQueryCommend insert = new DBInsertDo();
		SQLQueryCommend delete = new DBDeleteDo();
		SQLQueryCommend update = new DBUpdateDo();
		SQLQueryCommend select = new DBSelectDo();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("회원관리 프로그램을 실행할까요? (y/n) : ");
			String yn = input.next();
			
			if (yn.equals("n")) {
				System.out.println("회원관리 프로그램을 종료합니다.");
				input.close();
				break;
			} else if (yn.equals("y")) {
				while(true) {
					System.out.print("쿼리문 입력 (종료:n) : ");
					String query = input.next();

					if (query.equals("n")) {
						System.out.println("회원관리 프로그램을 종료합니다.");
						input.close();
						break;
					} else if (query.equals("insert")) {
						insert.excuteQueryCommend();
					} else if (query.equals("delete")) {
						delete.excuteQueryCommend();
					} else if (query.equals("update")) {
						update.excuteQueryCommend();
					} else if (query.equals("select")) {
						select.excuteQueryCommend();
					} else {
						System.out.println("쿼리 입력 오류 !");
						continue;
					}
				}
			} else {
				System.out.println("입력이 올바르지 않습니다 !");
				continue;
			}
			input.close();
			break;
		}
	}
}
