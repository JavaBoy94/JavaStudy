package org.study.exceptionEx;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		// ArrayIndexOutOfBoundsException 예외처리
		int[] arr = new int[5];
		
		try {
			for (int i=0; i<6; i++) {
				arr[i] = i;
			}
			System.out.println("Success !");           // try에서 에러발생시 바로 catch로 넘어가기 때문에 해당 출력문은 실행X
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("Fail !");
		} finally {
			// Connection close
			System.out.println("기본실행문");
		}
		
	
		
		System.out.println("프로그램 정상실행");      
		
		
		
	}
}
