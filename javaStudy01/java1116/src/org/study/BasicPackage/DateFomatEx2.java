package org.study.BasicPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFomatEx2 {

	public static void main(String[] args) {
		
		System.out.println("DateFormat 클래스");
		
		Date now = new Date();
		System.out.println(now);
		
		System.out.println("------------");
		
		// 날짜(시간제외) => (날짜 포맷, 지역)
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		System.out.println(df.format(now));
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
		System.out.println(df1.format(now));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		System.out.println(df2.format(now));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println(df3.format(now));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		System.out.println(df4.format(now));
		
		System.out.println("---------------");
		
		// 날짜(시간포함) => (날짜 포맷, 시간 포맷, 지역)
		DateFormat dff = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.KOREA);
		System.out.println(dff.format(now));
		
		DateFormat dff1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.KOREA);
		System.out.println(dff1.format(now));
		
		DateFormat dff2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.KOREA);
		System.out.println(dff2.format(now));
		
		DateFormat dff3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(dff3.format(now));
		
		DateFormat dff4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		System.out.println(dff4.format(now));
	}
}
