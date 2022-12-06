package org.study.loopEx;

public class DoWhileEx01 {
	
	public static void main(String[] args) {
		
		System.out.println("== Do~while ==");
		
		// do-while문
		
		int i=0;          // 1.초기화
		
		do {              // 2. do{명령문,증감식} >> 처음 한번은 무조건 실행
			System.out.println(i);
			i++;
		} while (i<10);   // 3. while (조건식) >> 조건이 true면 do반복
		
	}
}
