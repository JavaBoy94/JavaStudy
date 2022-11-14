package org.study.packageEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;

import javax.xml.crypto.Data;

public class BasicClass {

	public static void main(String[] args) {
		
		// java.lang 패키지(기본클래스) => import 필요없음
		
		Object o = null;       // 자바 최상위 클래스
		System s = null;       // 표준입출력(키보드,모니터) JVM종료
		Class c = null;        // JDBC드라이버 찾기(클래스를 메모리에 로드)
		String str = null;     // 문자열 저장 (수정 불가능)
		StringBuffer b = null; // 문자열 조작 (수정 가능)
		Math m = null;         // 여러가지 수학적 도구
		Integer i = null;      // Wrapper 클래스 (8가지)
		
		// java.util 패키지(유용한 클래스) => 주로 컬렉션 클래스 종류
		
		String[] ab = {"manso", "1111"};
		Arrays.asList(ab);            // 배열 조작(비교, 정렬, 찾기)
		Calendar c1 = null;           // 운영체제 시간 
		Date d = null;                // 날짜와 시간
		Objects o1;                   // 객체를 비교, null여부 
		StringTokenizer s2 = null;    // 특정 문자열 기준으로 문자열 추출
		Random r = null;              // 무작위값(난수) 추출 (0 <= r < 1)
	}
}
