package org.study.Inheritance;

public class OverrideParentMain {
	
	public static void main(String[] args) {
		
		// 자식클래스에서 오버라이딩한 메소드 사용하기
		
		OverrideChild1 o1 = new OverrideChild1();
		OverrideChild2 o2 = new OverrideChild2();
		OverrideChild3 o3 = new OverrideChild3();

		o1.excuteQuery();
		o2.excuteQuery();
		o3.excuteQuery();
	}
}
