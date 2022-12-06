package org.study.oop;

public class OverLoadingMain {
	
	static int num1;
		
	public static void main(String[] args) {
		
		num1=100;
		
		OverLoading1 over1 = new OverLoading1();
		
		over1.non_staticMethod1();
		
		over1.method1();
		over1.method1(100);
		over1.method1(100, "name");
		over1.method1("name", 100);
	}
}
