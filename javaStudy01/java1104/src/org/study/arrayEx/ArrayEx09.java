package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {

		System.out.println("==다차원 배열==");

		// 5행 5열의 int 타입 다차원 생성
		// 정수 250부터 10씩 감소되어 10까지 초기화시켜 콘솔에 출력 
		// for문 사용
		// 일정한 수 간격으로 자료를 넣으려면 int타입의 빈 변수 생성 후, 이중for문 안에 수식을 만들어 사용   ex)num*10+10
		
		int[][] arr = new int[5][5];
		
		int num = 25;                      
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j] = num*10;
				System.out.print(arr[i][j]+"\t");
				num--;
			}
			System.out.println();           // 한 행이 끝나면 줄바꿈 
		}
		

		
		
		
//		int[][] arrInt = new int[5][5];
//
//		int num = 0;
//
//		for (int i = 0; i < arrInt.length; i++) {
//			for (int j = 0; j < arrInt[i].length; j++) {
//				arrInt[i][j] = num * 10 + 10;
//				System.out.print(arrInt[i][j] + "\t");
//				num++;
//			}
//			System.out.println();
//		}
		
	}
}
