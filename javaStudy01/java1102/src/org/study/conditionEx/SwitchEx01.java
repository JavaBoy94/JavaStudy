package org.study.conditionEx;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		System.out.println("==switch문==");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("key값 입력 : ");
		int key = input.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("관리자 권한");
			break;
		case 2:
			System.out.println("사장 권한");
			break;
		case 3:
			System.out.println("일반사원 권한");
			break;
		default:
			System.out.println("접속불가! 관리자에게 문의하세요");
		}
		
		System.out.println("======================");
		
		
		System.out.print("month 입력 : ");
		int key2 = input.nextInt();
		
		switch(key2) {
		case 1:
			System.out.println("1월 : January");
			break;
		case 2:
			System.out.println("2월 : February");
			break;
		case 3:
			System.out.println("3월 : March");
			break;
		case 4:
			System.out.println("4월 : April");
			break;
		case 5:
			System.out.println("5월 : May");
			break;
		case 6:
			System.out.println("6월 : June");
			break;
		case 7:
			System.out.println("7월 : July");
			break;
		case 8:
			System.out.println("8월 : August");
			break;
		case 9:
			System.out.println("9월 : September");
			break;
		case 10:
			System.out.println("10월 : October");
			break;
		case 11:
			System.out.println("11월 : November");
			break;
		case 12:
			System.out.println("12월 : December");
			break;
		default:
			System.out.println("입력오류 !");
		}
	}
}
