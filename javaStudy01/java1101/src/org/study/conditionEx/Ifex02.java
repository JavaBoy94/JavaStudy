package org.study.conditionEx;

import java.util.Scanner;

public class Ifex02 {

	public static void main(String[] args) {
		
		System.out.println("조건이 하나일 때");
		
		// 점수를 입력받아 90점 이상이면 A 출력
		// 점수를 입력받아 80점 이상이면 B 출력
		// 점수를 입력받아 70점 이상이면 C 출력
		// 점수를 입력받아 60점 이상이면 D 출력
		// 점수를 입력받아 60점 미만이면 F 출력

		Scanner input = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 (0~100) : ");
		int kor = input.nextInt();
		
		if (kor<=100 && kor>=90) System.out.println("A"); // 100점 이하, 90점 이상은 A
		if (kor<90 && kor>=80) System.out.println("B");   //  90점 미만, 80점 이상은 B   
		if (kor<80 && kor>=70) System.out.println("C");   //  80점 미만, 70점 이상은 C
		if (kor<70 && kor>=60) System.out.println("D");   //  70점 미만, 60점 이상은 D
		if (kor<60) System.out.println("F");              //  60점 미만은 F
		if (kor<0 | kor>100) System.out.println("점수가 올바르지 않습니다.");
	
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
	}
}
