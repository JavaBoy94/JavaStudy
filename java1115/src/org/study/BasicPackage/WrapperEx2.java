package org.study.BasicPackage;

public class WrapperEx2 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		
		int i = 10;
		
		Integer i2 = new Integer(i);   // 박싱
		System.out.println(Integer.bitCount(i));  // 2진수 변환시 1의 갯수
		
		System.out.println(i2.intValue());      // int로 언박싱
		System.out.println(i2.longValue());     // long으로 언박싱
		System.out.println(i2.shortValue());    // short로 언박싱
		
		int i3 = Integer.parseInt("111");	    // 문자열을 정수형으로 변환
		Integer i4 = Integer.parseInt("111");	
		System.out.println(i3 == i4);
		System.out.println(i3 + " , " + i4);
		
		System.out.println(Integer.parseInt("111",2));   // 2진수 문자열 "111"을 정수형(10진수)로 변환
		
		
	}
}
