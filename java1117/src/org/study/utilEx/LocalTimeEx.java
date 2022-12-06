package org.study.utilEx;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		
		System.out.println("LocalTime 클래스");
		
		LocalTime ltime = LocalTime.now();
		
		System.out.println(ltime);        // "hh:mm:ss.nnn" 포맷으로 출력
		System.out.println(ltime.getHour());
		System.out.println(ltime.getMinute());
		System.out.println(ltime.getSecond());
		System.out.println(ltime.getNano());
		
		System.out.println("----------------------");
		
		LocalTime ltime2 = LocalTime.of(10, 51, 50, 50);    // 파라미터에 임의의 시간 설정
		
		System.out.println(ltime2);
		System.out.println(ltime2.getHour());
		System.out.println(ltime2.getMinute());
		System.out.println(ltime2.getSecond());
		System.out.println(ltime2.getNano());
		
	}
}
