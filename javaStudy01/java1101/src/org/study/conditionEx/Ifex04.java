package org.study.conditionEx;

import java.util.Scanner;

public class Ifex04 {

	public static void main(String[] args) {
		
		System.out.println("조건이 두개일 때");
		
		// 90점 이상이면 => A, 95점 이상이면 A+   => if문 중첩 사용 (90점 이상이면 다시 if문 - 95점이상이면 A+, 그외에는 A를 출력)

		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 (0~100) : ");
		int kor = input.nextInt();
		
		if (kor>=90 && kor<100) {
			if (kor>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (kor>=80 && kor<90) {
			if (kor>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (kor>=70 && kor<80) {
			if (kor>=75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		}else if (kor>=60 && kor<70) {
			if (kor>=65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else if (kor>=0 && kor<60) {
			System.out.println("F");
		} else {
			System.out.println("점수가 올바르지 않습니다 !");
		}
	
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
	}
}
