package org.study.exceptionEx;

public class Test1118 {

	public static void main(String[] args) {
		
		int i = 10;
		// 박싱 (기본자료형 -> 객체형)
		Integer i2 = new Integer(i);
		// 언박싱 (객체형 -> 기본자료형)
		int i3 = i2.intValue();
		
		// 자동박싱
		Integer i4 = i;
		// 자동언박싱
		int i5 = i4;
		int i6 = new Integer(20);
	}
}
