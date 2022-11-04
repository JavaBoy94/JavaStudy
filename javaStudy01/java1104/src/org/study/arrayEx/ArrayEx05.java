package org.study.arrayEx;

public class ArrayEx05 {

	public static void main(String[] args) {

		System.out.println("==배열==");

		// 배열 생성 방법들
		char[] c1 = new char[5];
		char[] c2 = new char[] { 'a', 'b', 'c', 'd', 'e' };
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();

		// 객체형 반복문 (foreach)
		for (char idx : ch) { // ch배열의 자료들을 idx변수에 불러옴
			System.out.print(idx + " ");
		}
		System.out.println();

		int[] arr = new int[45];
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
