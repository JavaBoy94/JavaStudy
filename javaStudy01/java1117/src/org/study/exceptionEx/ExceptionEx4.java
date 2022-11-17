package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		// 다중 예외처리
		Scanner input = new Scanner(System.in);
		
		int num1 = 10;
		int[] arr = new int[5];
	
		try {
			System.out.print("숫자 입력: ");
			int num2 = input.nextInt();
			
			System.out.println(num2);
			System.out.println(num1/num2);
			System.out.println(arr[num2]);
			System.out.println("모두 성공 !");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Fail !");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Fail !");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Fail !");
		} catch (Exception e) {   // 모든 예외를 한번에 처리
			e.printStackTrace();
		} finally {
			System.out.println("기본실행문");
		}
		
		
	
		
		System.out.println("프로그램 정상실행");      
		
		
		
	}
}
