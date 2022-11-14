package org.study.InterfaceEx;

public interface InterfaceEx1 {
	
	// 인스턴스 멤버로 올 수 있는 것 : 추상메소드, final상수, default, static멤버
//	public int num1;
	
	public static final int MAXNUM=1000;     // final 상수★
	public abstract void abstractMethod1();  // 추상메소드★
	public static void staticMethod1() {
		System.out.println("static 메소드");   // static
	}
	default void defaultMethod2() {
		System.out.println("dafault 메소드");  // default (사용은 가능하지만, 기본적으로 public이기 때문에 잘 쓰이진 않음)
	}
	
}
