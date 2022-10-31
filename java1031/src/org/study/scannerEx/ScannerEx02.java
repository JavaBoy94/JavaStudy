package org.study.scannerEx;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 숫자(정수) 입력: ");
		int fir = scn.nextInt();                   
		
		System.out.println("두번째 숫자(정수) 입력: ");
		int sec = scn.nextInt();
		
		System.out.println("연산결과 : "+fir+" + "+sec+" = "+(fir+sec));
		
		
	}
}
