package org.study.operatorEx;

public class Operator13 {

	public static void main(String[] args) {

		System.out.println("for문");

		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		// 1~10까지 출력할 경우
		for (int i=1; i<11; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		// 이미지파일에 활용
		for (int i=0; i<10; i++) {
			System.out.println("<img src='shopping_"+i+".jpg'>");
		}
		
	}
}
