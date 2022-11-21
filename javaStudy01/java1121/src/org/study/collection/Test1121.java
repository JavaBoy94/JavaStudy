package org.study.collection;

public class Test1121 {

	public static void main(String[] args) {
		
		
		try {
			int[] arr = new int[5];
			
			arr[5] = 10;
			
			System.out.println("예외 안발생!");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("예외발생 - 배열범위 초과");
		} finally {
			System.out.println("기본실행");
		}
		
		
		System.out.println("정상실행");
		
	}
}
