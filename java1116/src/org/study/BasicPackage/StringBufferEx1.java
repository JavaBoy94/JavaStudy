package org.study.BasicPackage;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		System.out.println("StringBuffer");
		
		// 수정가능
		StringBuffer sb1 = new StringBuffer("JAVA");
		
		// append : 기본 문자열 끝에 문자열을 추가
		sb1.append(" PROJECT 2022");
		System.out.println(sb1);    // 원본이 수정됨
		
		// delete : 해당 인덱스 범위의 문자열 삭제
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		// insert : 원하는 지점에 문자열 삽입
		sb1.insert(0, "ORACLE");
		System.out.println(sb1);
		
		// reverse : 문자열을 역순으로 바꿈
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		// replace : 시작점~끝점-1 범위에 해당 문자열로 교체
		sb1.replace(0, 6, "JAVA");
		System.out.println(sb1);
		
		// substring : 시작점~끝점-1 범위의 문자열을 반환    => 원본변화 X
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(5, sb1.length()-4));
		System.out.println(sb1);     // 원본은 그대로
	}
}
