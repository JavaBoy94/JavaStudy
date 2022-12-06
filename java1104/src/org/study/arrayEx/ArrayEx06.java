package org.study.arrayEx;

public class ArrayEx06 {

	public static void main(String[] args) {

		System.out.println("char배열 >> String");

		
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		
		String str1 = new String(ch);      // String객체 인자에 ch배열 입력 ('a','b','c','d','e' => "abcde")
		System.out.println(str1);
		
		String str2 = String.valueOf(ch);  // String.valueOf() 사용
		System.out.println(str2);
		
		
		
		
	}
}
