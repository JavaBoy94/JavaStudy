package org.study.loopEx;

public class WhileEx01 {

	public static void main(String[] args) {
		
		System.out.println("==while문==");
		
		int i=0;    // while 밖에서 초기화
		
		while (i<10) {   // 조건식 (true일때만 실행)
			if (i==9) {
				System.out.print(i);				
			} else {
				System.out.print(i+", ");
			}
			i++;         // 증감식
		}
	}
}
