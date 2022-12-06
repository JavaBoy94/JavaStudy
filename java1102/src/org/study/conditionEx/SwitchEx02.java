package org.study.conditionEx;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

		System.out.println("==switch문==");

		Scanner input = new Scanner(System.in);

		System.out.print("알파벳 입력 : ");
		String alpha = input.next();

		switch (alpha) {
		case "a":
		case "A":
			System.out.println("알파벳 : A");
			break;
		case "b":
		case "B":
			System.out.println("알파벳 : B");
			break;
		case "c":
		case "C":
			System.out.println("알파벳 : C");
			break;
		default:
			System.out.println("A, B, C 이외의 알파벳입니다.");
		}

	}
}
