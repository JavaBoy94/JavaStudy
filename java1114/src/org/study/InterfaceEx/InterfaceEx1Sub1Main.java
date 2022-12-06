package org.study.InterfaceEx;

public class InterfaceEx1Sub1Main {

	public static void main(String[] args) {
		
		InterfaceEx01Sub1 inter = new InterfaceEx01Sub1();
		inter.num1=10;
		inter.method1();
		inter.abstractMethod1();
		inter.abstractMethod2();
		inter.defaultMethod2();
		int maxNum = inter.MAXNUM;
		
		System.out.println();
		
		InterfaceEx1 inter2 = new InterfaceEx01Sub1();
		inter2.abstractMethod1();
		inter2.defaultMethod2();
		int maxNum2 = inter2.MAXNUM;
		
		System.out.println();
		
		InterfaceEx2 inter3 = new InterfaceEx01Sub1();
		inter3.abstractMethod2();
		
		
	}
}
