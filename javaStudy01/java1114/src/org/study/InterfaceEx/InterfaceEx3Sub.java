package org.study.InterfaceEx;

public class InterfaceEx3Sub implements InterfaceEx3 {
	
	String name;

	@Override
	public void excuteQuery1() {
		System.out.println("오버라이드 1");
		
	}

	@Override
	public void excuteQuery2() {
		System.out.println("오버라이드 2");
		
	}

	
}
