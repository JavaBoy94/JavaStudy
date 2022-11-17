package org.study.utilEx;

import java.time.LocalDateTime;

public class LocalEx1 {

	public static void main(String[] args) {
		
		System.out.println("날짜 조절");
		// 날짜조절
		// LocalDate, LocalTime, LocalDateTime 전부 사용가능
		// .plus~  .minus~ 사용

		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : "+curDateTime);
		System.out.println("-------------------");
		
		// 년도 더하기
		LocalDateTime tarDateTime = curDateTime.plusYears(10);
		System.out.println("년도 더하기(10) : "+tarDateTime);
		
		// 월 더하기
		tarDateTime = curDateTime.plusMonths(5);
		System.out.println("월 더하기(5) : "+tarDateTime);
		
		// 월 빼기
		tarDateTime = curDateTime.minusMonths(5);
		System.out.println("월 빼기(5) : "+tarDateTime);
		
		// 일 더하기
		tarDateTime = curDateTime.plusDays(10);
		System.out.println("일 더하기(10) : "+tarDateTime);
		
		// 일 빼기
		tarDateTime = curDateTime.minusDays(10);
		System.out.println("일 빼기(10) : "+tarDateTime);
		
	}
}
