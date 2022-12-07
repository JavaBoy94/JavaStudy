package org.study.BasicPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
		System.out.println("StringTokenizer");
		
		String url = "userId=m111&userPw=1111&userName=s1111";
		
		StringTokenizer token = new StringTokenizer(url,"&");   // 분리자 : &
		System.out.println("토큰 갯수 : "+token.countTokens());     // &를 기준으로 나뉘어진 토큰의 갯수
		
		// 토큰이 있으면 => 패턴이 정해져있음
		while (token.hasMoreTokens()) {           // 토큰이 있으면 => 분리자가 존재하면
			String ntoken = token.nextToken();    // 다음 토큰(분리자)까지의 내용을 String 변수(ntoken)에 참조
			System.out.println(ntoken);
		}
		
		System.out.println("---------------------");
		
		// StringTokenizer 이용하여 -구분기호를 콘솔에 출력
		String phone = "010-1234-5678";
		StringTokenizer token2 = new StringTokenizer(phone, "-");   // 분리자 : -
		System.out.println("토큰 갯수 : "+token2.countTokens());        // -를 기준으로 나뉘어진 토큰의 갯수
		while (token2.hasMoreTokens()) {
			String ntoken = token2.nextToken();    // 다음 토큰
			System.out.println(ntoken);
		}
		
	}
}
