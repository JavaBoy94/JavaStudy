package org.study.loopEx;

import java.util.Scanner;

public class DoWhileEx02 {
	
	public static void main(String[] args) {
		
		System.out.println("== Do~while ==");
		
		// 구구단 만들기 (2~9단)
		// 시작단, 끝단 입력받아 시작단~끝단 구구단 출력 (시작단 < 끝단)
		// 스캐너 사용
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== 구구단 ==");
		
		System.out.print("시작단 입력 : ");
		int num1=input.nextInt();
		
		System.out.print("끝단 입력 : ");
		int num2=input.nextInt();
		
		if (num1<num2) {
			int i=num1;
			
			do {
				System.out.println(i+"단----");
				int j=1;
				
				do {
					System.out.println(i+"*"+j+"="+(i*j));
					j++;
				} while (j<10);
				i++;
			} while (i<num2+1);
		} else {
			System.out.println("시작단이 끝단보다 작아야 합니다!");
		}
		
		
	}
}
