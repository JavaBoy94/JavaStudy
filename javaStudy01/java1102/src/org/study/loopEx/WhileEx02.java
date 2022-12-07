package org.study.loopEx;

public class WhileEx02 {

	public static void main(String[] args) {
		
		System.out.println("==while문==");
		
		int i=0;
		
		// 0~10까지만 출력
		while (true) {    // 조건식이 true => 항상 실행  => if, break 필요
			if (i==10) {
				System.out.print(i);
				break;    // i가 10이 되면 해당 명령문까지 처리후, while문 자체를 종료
			} else {
				System.out.print(i+", ");
			}
			i++;
			
		
		}
	}
}
