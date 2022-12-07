package org.study.conditionEx;

import java.util.Scanner;

public class Ifex04 {

	public static void main(String[] args) {
		
		System.out.println("조건이 두개일 때");
		
		// 90점 이상이면 => A, 95점 이상이면 A+   => if문 중첩 사용 (90점 이상이면 다시 if문 - 95점이상이면 A+, 그외에는 A를 출력)

		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 (0~100) : ");
		int kor = input.nextInt();
		
		// 90이상 A, 95이상 100이하 : A+
		if (kor>=90 && kor<=100) {
			if (kor>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} 
		
		// 80이상 B, 85이상 90미만 : B+
		if (kor>=80 && kor<90) {
			if (kor>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} 
		
		// 70이상 C, 75이상 80미만 : C+
		if (kor>=70 && kor<80) {
			if (kor>=75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		}
		
		// 60이상 D, 65이상 70미만 : D+
		if (kor>=60 && kor<70) {
			if (kor>=65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} 
		
		// 0이상 60미만 : F
		if (kor>=0 && kor<60) {
			System.out.println("F");
		} 
	
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
	}
}
