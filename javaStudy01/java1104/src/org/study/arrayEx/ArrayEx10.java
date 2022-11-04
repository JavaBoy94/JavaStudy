package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {

		System.out.println("==다차원 배열==");

		int[][] score = {
			//   국어     영어   수학
				{100, 67, 77},
				{88, 66, 88},
				{80, 46, 97},
				{70, 88, 85},
				{100, 90, 89}
		};
		
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0;
		double sumAvg = 0;
		
		
		System.out.println("=================중간고사 성적표===================");
		System.out.println();
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("----------------------------------------------");
		for (int i=0; i<score.length; i++) {
			System.out.print(i+"\t");
			for (int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");   // \t : tap 한 칸만큼 띄움
			}
			
			avg = sum / score[i].length;
			sumAvg += avg;  
			System.out.println(sum+"\t"+avg);
			sum = 0;
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
		}
		
		double korAvg = kor/score.length;
		double engAvg = eng/score.length;
		double mathAvg = math/score.length;
		
		System.out.println("----------------------------------------------");
		System.out.println("과목합계\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("과목평균\t"+korAvg+"\t"+engAvg+"\t"+mathAvg);
		System.out.println("평균점수\t"+sumAvg/score.length);
		
		

		
//		int kor = 0;
//		int math = 0;
//		int eng = 0;
//		int sum = 0;
//		double avg = 0.0;
//		int scoreLength = score.length;  // 배열의 길이
//		System.out.println("배열행 수 : "+scoreLength);
//		
//		System.out.println("중간고사 성적표");
//		System.out.println("번호    국어    수학    영어    총점    평균");
//		System.out.println("=========================");
//		
//		for (int i=0; i<scoreLength; i++) {
//			System.out.print("  "+(i+0)+"  ");
//			
//			kor += score[i][0];    // score배열의 0번지 합계 (국어)
//			eng += score[i][1];   // score배열의 1번지 합계 (영어)
//			math += score[i][2];    // score배열의 2번지 합계 (수학)
//			
//			for (int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"  ");
//				sum += score[i][j];  // 총점
//			}
//			
//			avg = (double) sum / scoreLength;
//			System.out.println(sum+" "+avg);
//		}
//		
//		System.out.println("=========================");
//		
//		System.out.println("과목별  "+kor+" "+eng+" "+math);
//		
		
	}
}
