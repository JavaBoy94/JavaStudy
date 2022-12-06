package org.study.oop;

public class MethodBasicMain {

	public static String userId;
	
	public static final String PROJECT="PROJECT2022";
	
	public static void main(String[] args) {
		
		userId="mee10";  // static 메소드에서는 static필드 요소만 참조 가능
		
		MethodBasic method1 = new MethodBasic();
		
		method1.method1();
		System.out.println(method1.method2());
		int sum=method1.method2();
		System.out.println(sum);
		method1.method3(100, 200);
		method1.method4(100, 200);
		System.out.println(method1.method4(100, 200));
		int sum2=method1.method4(200, 400);
		System.out.println(sum2);
	}
}
