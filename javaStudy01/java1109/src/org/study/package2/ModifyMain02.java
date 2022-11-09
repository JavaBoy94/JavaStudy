package org.study.package2;

import org.study.package1.ModifyEx01;
// 다른패키지에 생성
public class ModifyMain02 {

	public static void main(String[] args) {
		
		ModifyEx01 m1 = new ModifyEx01();
		m1.num1=100;
		m1.setNum2(2);
//		m1.num3=3;
//		m1.num4=4;
		// 다른패키지에서는 public만 접근 가능 (private는 setter/getter를 사용하는 조건에서 가능)

		m1.m1();
		
		// ModifyEx02 m2 = new ModifyEx02();
		// 다른 패키지에선 default클래스(ModifyEx02)접근 불가능
		
	}
}
