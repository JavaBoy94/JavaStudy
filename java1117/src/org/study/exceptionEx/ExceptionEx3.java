package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		// InputMismatchException 예외처리
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("정수 입력 : ");
			int num = input.nextInt();
			System.out.println(num);
			System.out.println("Success !");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Fail~ !");
		} finally {
			// Connection close
			System.out.println("기본실행문");
		}
		
		
		input.close();
		
	
		
		System.out.println("프로그램 정상실행");      
		
		
		
	}
}
