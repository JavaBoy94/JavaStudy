package org.java.variableex;

import java.util.Scanner;

public class Scannerex01 {
	
	public static void main(String[] args) {
//		// String
//		System.out.println("Scanner");
//		
//		System.out.println("데이터를 입력 하세요:");
//		Scanner scn = new Scanner(System.in);  
//		String str = scn.nextLine();
//		System.out.println("입력값: " + str);
//		
//		scn.close();
		
		
		// Int
		System.out.println("Scanner2");
		
		System.out.println("나이를 입력 하세요:");
		Scanner scn2 = new Scanner(System.in);  
		int age = scn2.nextInt();
		System.out.println("나이: " + age);
		
		scn2.close();
		
	}
}
