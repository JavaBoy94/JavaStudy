package org.study.oop;

public class MethodExMain {

	public static void main(String[] args) {
		
		MethodEx m1 = new MethodEx();
	
		m1.method1();
		
		System.out.println(m1.method2());   // 방법1) method2 메소드에는 지역변수만 지정되어 있으므로(호출값:30) 출력메소드 안에서 호출값 사용
		int num1 = m1.method2();            // 방법2) m1.method2 호출값(30)을 num1 변수에 저장하여 출력
		System.out.println(num1);
		
		System.out.println(m1.method3());
		String str1 = m1.method3();
		System.out.println(str1);
		
		m1.method4(20, 30);
		
		m1.method5(15, 20);
		
		m1.method6(10, 20, "+");
		m1.method6(10, 20, "-");
		m1.method6(10, 20, "*");
		m1.method6(10, 20, "/");
		
	}
	
}
