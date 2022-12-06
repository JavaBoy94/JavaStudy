package org.study.AbstractEx;

import java.util.Scanner;

public class DBController {

	public static void main(String[] args) {
		
		// 다형성 적용하여 부모타입의 구현객체 인스턴스 생성
		SqlQueryCommend insert = new DBInsertDo();
//		insert.excuteQueryCommend();
//		
		SqlQueryCommend delete = new DBDeleteDo();
//		delete.excuteQueryCommend();
//		
		SqlQueryCommend update = new DBUpdateDo();
//		update.excuteQueryCommend();
//		
		SqlQueryCommend select = new DBSelectDo();
//		select.excuteQueryCommend();
		
		
		// 스캐너, while(true) 이용하여 회원관리 쿼리 프로그램 생성
		
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("쿼리문을 실행할까요? (y/n) : ");
			String yn = input.next();
			
			if (yn.equals("n")) {
				System.out.println("회원관리 프로그램 종료");
				input.close();
				break;
			} else if (yn.equals("y")) {
				while(true) {
					System.out.print("쿼리문을 입력 (종료:n) : ");
					String query = input.next();
					
					if (query.equals("n")) {
						System.out.println("회원관리 프로그램 종료");
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
						System.out.println("다시 입력해주세요");
						continue;
					}
				}
			} else {
				System.out.println("입력이 올바르지 않습니다!");
				continue;
			}
			input.close();
			break;
		}
	}
}
