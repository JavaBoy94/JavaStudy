package org.study.scannerEx;

import java.util.Scanner;

public class ScannerEx01 {
	
	public static void main(String[] args) {
		
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);     // 사용자로부터 입력값 받아두기
		
		System.out.print("주소를 입력하세요. ");
		String addr = scn.nextLine();              // 입력값을 리턴, 공백 가능
		
		System.out.print("이름을 입력하세요. ");
		String name = scn.next();                  // 공백 불가

		System.out.print("나이를 입력하세요. ");
		int age = scn.nextInt();
		
		System.out.print("키를 입력하세요. ");
		double hei = scn.nextDouble();
		
		System.out.printf("신상정보 : "+addr+" "+name+" "+age+"세 "+hei+"cm");
		
	}
}
