package org.study.conditionEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

//		Quiz_Condition
//		학점 계산
//
//		정수로 입력
//		국어점수:  kor
//		수학점수:  math
//		영어점수:  eng
//		총점: sum=kor+math+eng
//		평균: avg=sum/3 (소수는 무시->모든 변수는 int)
//
//		if~else if~else 이용해서
//		평균>=90 "A"
//		평균>=80 "B"
//		평균>=70 "C"
//		평균>=60 "D"
//		평균<60 "F"
//
//		콘솔에 출력
//		1. 총점: 
//		2. 평균:
//		3. 학점: 

		System.out.println("==국영수 학점 계산기==");

		Scanner input = new Scanner(System.in);

		System.out.print("국어점수 입력 (0~100) : ");
		int kor = input.nextInt();

		System.out.print("수학점수 입력 (0~100) : ");
		int math = input.nextInt();

		System.out.print("영어점수 입력 (0~100) : ");
		int eng = input.nextInt();

		int sum = kor + math + eng;
		int avg = sum / 3;
//		double avg = sum / 3;
		
		String grade = "";   // 학점을 넣을 변수 공간 생성

		if (avg <= 100 && avg >= 90) {
			grade = "A";
		} else if (avg < 90 && avg >= 80) {
			grade = "B";
		} else if (avg < 80 && avg >= 70) {
			grade = "C";
		} else if (avg < 70 && avg >= 60) {
			grade = "D";
		} else if (avg < 60 && avg >= 0) {
			grade = "F";
		} else {
			System.out.println("점수가 올바르지 않습니다 !");
		}
		
		System.out.println("1. 총점 : " + sum);
		System.out.println("2. 평균 : " + avg);
		System.out.println("3. 학점 : " + grade);
		

		input.close();

	}
}
