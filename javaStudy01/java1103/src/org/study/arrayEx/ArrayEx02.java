package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		System.out.println("==배열==");
		
		int[] arr1 = new int[5];   // 새로운 배열 선언 및 초기화
		System.out.println(arr1);
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);  // 값을 초기화(입력)하지 않으면 0으로 초기화
		}
	
		System.out.println();
		
		int[] arr2 = new int[] {1,2,3,4,5};   // 새로운 배열 선언 후 바로 값을 넣어 초기화
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		// foreach문
		int[] arr3 = {1,2,3,4,5};
		for (int i:arr3) {
			System.out.print(i);
		}
		
		System.out.println();
		
		char[] arrCh = {'a','b','c','d','e'};
		for (char i:arrCh) {
			System.out.print(i);
		}
		
		System.out.println();
		
		String[] strArr = new String[] {"java", "jsp", "backend"};
		for (String i:strArr) {
			System.out.println(i);
		}
	}
}
