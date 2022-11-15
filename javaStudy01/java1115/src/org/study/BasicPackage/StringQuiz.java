package org.study.BasicPackage;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {

		// if문 활용 => 끝이 ".do"일때 해당하는 쿼리문 실행
		// .do를 추출
		// 스캐너, substring, while, if문 등 사용
		// 스캐너 입력값 끝 3자리가 .do여야함
		// .do 일 때, 쿼리문 실행
		// 스캐너 입력값이 exit이면 "종료"
		// 스캐너 입력값이 exit이나 .do가 아니면 다시입력
	
		while (true) {
			Scanner input = new Scanner(System.in);

			System.out.print("쿼리문 입력 : ");
			String query = input.next();

			if (query.substring(query.length() - 3).equals(".do")) {
				if (query.subSequence(0, query.length() - 3).equals("/insert")) {
					System.out.println("회원가입");
				} else if (query.subSequence(0, query.length() - 3).equals("/update")) {
					System.out.println("회원수정");
				} else if (query.subSequence(0, query.length() - 3).equals("/delete")) {
					System.out.println("회원탈퇴");
				} else if (query.subSequence(0, query.length() - 3).equals("/select")) {
					System.out.println("회원조회");
				} else {
					System.out.println("입력 오류!");
					continue;
				}
			} else if (query.equals("exit")) {
				System.out.println("종료");
				input.close();
				break;
			} else {
				System.out.println("입력 오류!");
				continue;
			}
		}
	}
}
