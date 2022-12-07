package org.study.InterfaceEx;

public interface InterfaceEx3 {

	// 추상메소드의 생략형태 => public abstract 생략
	abstract void excuteQuery1();  // public 생략
	void excuteQuery2();           // public abstract 생략
	
	// final 상수의 생략형태 => public static final 생략
	static int MAXNUM1=100;  // public final 생략
	int MAXNUM2=200;         // public static final 생략
}
