package org.study.utilEx;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeEx {

	public static void main(String[] args) {
		
		// 1970.01.01 을 기준으로 현재까지 경과한 시간을 밀리초로 계산
		long time = System.currentTimeMillis();
		
		System.out.println("시스템 밀리초 구하기 : "+time);
		
		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		
		System.out.println("경과시간(초) 구하기 : "+(time2-time1) / 1000.0);
		
		TimeZone us = TimeZone.getTimeZone("US/Samoa");
		TimeZone eu = TimeZone.getTimeZone("Europe/London");
		
		System.out.println(us);
		System.out.println(eu);
		
		Calendar cal1 = Calendar.getInstance(us);
		Calendar cal2 = Calendar.getInstance(eu);
		
		System.out.println(cal1);
		System.out.println(cal2);
	}
}
