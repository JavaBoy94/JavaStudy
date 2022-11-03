package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		System.out.println("==배열==");
		
		// int형 데이터 5개를 저장할 수 있는 배열 생성
		
		int[] arr1 = new int[5];   // 길이가 5인 int형 배열을 선언하고 초기화한 상태 (자료를 넣을 주소값 생성)
//		int arr1[] = new int[5];   // 배열명에 []추가도 가능
		
		arr1[0] = 1;    // arr1의 0번지를 1로 초기화
		arr1[1] = 2;    // arr1의 1번지를 2로 초기화
		arr1[2] = 3;    // arr1의 2번지를 3로 초기화
		arr1[3] = 4;    // arr1의 3번지를 4로 초기화
		arr1[4] = 5;    // arr1의 4번지를 5로 초기화
		
		int arr1Size = arr1.length;              // 배열의 전체길이(갯수)를 출력
		System.out.println(arr1Size);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println(Arrays.toString(arr1));        // Arrays메소드를 임포트하여 배열을 문자열로 변환
		
		int[] arr2 = new int[] {10,20,30,40,50};
		
		
		
		// for문으로 배열 만들기
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i]=i*10+10;
			System.out.println(arr1[i]);	
		}
		
		
		// foreach문
		for (int i: arr1) {
			System.out.println(i);
		}
		
		
	}
}
