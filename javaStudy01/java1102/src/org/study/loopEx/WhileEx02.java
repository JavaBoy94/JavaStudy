package org.study.loopEx;

public class WhileEx02 {

	public static void main(String[] args) {
		
		System.out.println("==while문==");
		int i=0;
		// 조건식이 true => 항상 실행  => if, break 필요
		// 0~9까지만 출력
		while (true) {
			if (i==10) {
				System.out.print(i);
				break;
			} else {
				System.out.print(i+", ");
			}
			i++;
			
		
		}
	}
}
