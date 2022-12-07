package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		System.out.println("LocalDateTime 클래스");
		
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		LocalTime ltime = LocalTime.now();
		System.out.println(ltime);
		
		System.out.println("-------------");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		System.out.println(ldt.getNano());
		
		System.out.println("--------------");
		
		LocalDateTime ldt2 = LocalDateTime.of(2022, 11, 17, 11, 24, 10);   
		System.out.println(ldt2);
		
		System.out.println(ldt2.getYear());
		System.out.println(ldt2.getMonth());
		System.out.println(ldt2.getMonthValue());
		System.out.println(ldt2.getDayOfYear());
		System.out.println(ldt2.getDayOfMonth());
		System.out.println(ldt2.getDayOfWeek());
		System.out.println(ldt2.getHour());
		System.out.println(ldt2.getMinute());
		System.out.println(ldt2.getSecond());
		System.out.println(ldt2.getNano());
	}
}
