package org.study.BasicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		
		System.out.println("Date 클래스");
		
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.getTime());   // epoch(1970년 1월 1일 00시00분00초) 타임 기준으로 현재까지 경과한 millisecond 반환
		System.out.println(now.getYear());   // 1900년을 기준으로 지난 연수를 반환 => +1900 필요 (deprecated)
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth());  // 1월 기준 0부터 12월 11까지 중 현재 달에 해당하는 숫자를 반환  => +1 필요
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		System.out.println(now.getDay());    // 일요일 기준 0부터 토요일 6까지 중 현재 요일에 해당하는 숫자를 반환  => switch문 활용
		
		int weekday = now.getDay();
		String week = "";
		
		switch (weekday) {
		case 0:
			System.out.println("일요일");
			week = "일요일(Sun)";
			break;
		case 1:
			System.out.println("월요일");
			week = "월요일(Mon)";
			break;
		case 2:
			System.out.println("화요일");
			week = "화요일(Tue)";
			break;
		case 3:
			System.out.println("수요일");
			week = "수요일(Wen)";
			break;
		case 4:
			System.out.println("목요일");
			week = "목요일(Thr)";
			break;
		case 5:
			System.out.println("금요일");
			week = "금요일(Fri)";
			break;
		case 6:
			System.out.println("토요일");
			week = "토요일(Sat)";
			break;
		default:
			System.out.println("요일선택 오류!");
			break;
		}
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		
		System.out.println(now.getYear()+1900+"년 "+(now.getMonth()+1)+"월 "+now.getDate()+"일 "+week+now.getHours()+"시 "+now.getMinutes()+"분 "+now.getSeconds()+"초");
		
		System.out.println("--------------");
		
		// DateFormat : 시간정보의 출력포맷 제공
		
		// 1. 날짜 생성
		Date now1 = new Date();
		// 2. 날짜포맷 객체 생성
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		// 3. .format() => 해당 날짜를 세팅한 포맷에 맞춤
		System.out.println(format1.format(now1));

	}
}
