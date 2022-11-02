package org.study.loopEx;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		
		System.out.println("==for문==");
		
		String div = "<div>\n <ul>\n";
		
		for (int i=0; i<10; i++) {
			div+=" <li><img src='img/bg_"+i+".jpg'></li>\n";
		}
		
		div+=" </ul>\n</div>";
		
		System.out.println(div);
		
		System.out.println("=========================");
		// 스캐너로 구구단 만들기 
		// 시작단, 끝단을 입력받아 해당 범위의 구구단만 출력 (시작단 < 끝단)
		// for문 사용
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int num2 = input.nextInt();
		
		if (num1<num2) {
			for (int i=num1; i<num2+1; i++) {
				System.out.println("===="+i+"단====");
				for (int j=1; j<10; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		} else {
			System.out.println("첫번째 수는 두번째 수보다 작아야 합니다!");
		}
		
	}
}
