package org.study.utilEx;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		System.out.println("LocalDate 클래스");
		
		LocalDate ldate = LocalDate.now();   // 반환타입이 LocalDate
		System.out.println(ldate);           // "yyyy-MM-dd" 포맷출력
		
		System.out.println(ldate.getYear());         // 년
		System.out.println(ldate.getMonth());        // 월 (이름, 객체타입 반환)
		System.out.println(ldate.getMonthValue());   // 월 (숫자)
		System.out.println(ldate.getDayOfYear());    // 일수 (년기준)
		System.out.println(ldate.getDayOfMonth());   // 일수 (월기준)
		System.out.println(ldate.getDayOfWeek());    // 요일 (이름, 객체타입 반환)
		System.out.println(ldate.isLeapYear());      // 윤년여부 (boolean)
		
		

		
	}
}
