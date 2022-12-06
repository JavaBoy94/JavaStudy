package org.study.BasicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatEx {

	public static void main(String[] args) {
		
		System.out.println("DateFormat 클래스");
		
		Date now = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		String day1 = format.format(now);  // 반환타입은 String
		System.out.println(day1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String day2 = format2.format(now);
		System.out.println(day2);
		
		Date day3 = new Date(2022-1900, 11-1, 16, 16, 10, 12);
		System.out.println(day3);
		System.out.println(format.format(day3));
		System.out.println(format2.format(day3));
	}
}
