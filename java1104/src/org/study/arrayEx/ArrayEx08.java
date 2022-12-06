package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx08 {

	public static void main(String[] args) {

		System.out.println("==다차원 배열==");
		
		int[][] arr = new int[3][4];
		
		System.out.println(arr.length);       // 행의 길이(갯수) 출력
		System.out.println(arr[0].length);    // 0번째 행에 해당되는 열의 길이(갯수) 출력
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		
		System.out.println("-----------");
		
		int num = 0;
		
		for (int i=0; i<arr.length; i++) {        // 행의 길이(3)만큼 실행
//			System.out.println(arr[i]);
			
			for (int j=0; j<arr[i].length; j++) { // 행에 해당되는 열의 길이(4)만큼 실행
				arr[i][j] = ++num;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
