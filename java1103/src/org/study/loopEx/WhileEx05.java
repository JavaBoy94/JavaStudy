package org.study.loopEx;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		
		System.out.println("==while(true)==");
		
		// 숫자 0이 입력되면 while문을 종료
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = input.nextInt();     // while문 안에서 숫자를 받아야 함 (밖에서 받으면 while문을 적용받지 않음)
			if (num==0) {
				System.out.println("입력 종료 !");
				break;
			}
		}
		input.close();		
	}
}
