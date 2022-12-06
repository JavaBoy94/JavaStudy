package org.study.arrayEx;

public class Test1104 {

	public static void main(String[] args) {

		int i = 0;
		while (true) {
			if (i == 10) {
				break;
			}
			i++;
			System.out.print(i);
		}

		System.out.println("---------------");
		
		int i2 = 3;
		do {
			System.out.println(i2+"단 ");
		 int j= 1;
		 do {
		    System.out.println(i2+"*"+j+"="+(i2*j));
		     j++;
		} while (j<10);
		i2++;
		} while (i2<9);	
	
		System.out.println("----------------");
		
		int[] arr = new int[10]; // 배열 선언 및 초기화 (전체 인덱스 : 0~9)
		for (int j = 0; j < arr.length; j++) { // for문 범위 : 0~9
			arr[j] = j + 1; // 배열에 j를 0번째부터 9번째까지 순차적으로 대입
			System.out.print(arr[j]+" "); // 배열 출력
		}
		

	
	}
}
