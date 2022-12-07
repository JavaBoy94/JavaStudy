package org.study.BasicPackage;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();    // 싱글톤 패턴 => DAO에 사용
		System.out.println(now.getTime());
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR));           // 12시간 기준 시
		System.out.println(now.get(Calendar.HOUR_OF_DAY));    // 24시간 기준 시
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		
	}
}
