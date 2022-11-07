package org.study.oop;

public class MethodEx {

	// 메소드의 유형
	
	// 1. 반환타입 X, 매개변수 X
	public void method1() {
		System.out.println("인스턴스 메소드 method1");
		//return;   // 생략가능
	}
	
	// 2. 반환타입 int, 매개변수 X
	public int method2() {
		// 지역변수(logical) : 메소드 안에서 선언된 변수 => 리턴값이 출력나오면 종료
		int num1=10;
		int num2=20;
		
		return num1+num2;  // 반환타입이 int이므로 반환값도 int타입
		
	}
	
	// 3. 반환타입 String, 매개변수 X
	public String method3() {
		
		String name="m111";
		return name;
		
	}
	
	// 4. 반환타입 X, 매개변수 O 
	public void method4(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
	}
	
	// 5. 반환타입 int, 매개변수 O 
	public int method5(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("반환값 2, 매개인자 2");
		System.out.println(num1+"+"+num2+"="+sum);
		return sum;
		}
	
	// 6. 반환타입 X, 매개변수 O (계산기 메소드)
	public void method6(int num1, int num2, String op) {
		
		if (op.equals("+")) {
			System.out.println("연산결과");
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		} else if (op.equals("-")) {
			System.out.println("연산결과");
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		} else if (op.equals("*")) {
			System.out.println("연산결과");
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		} else if (op.equals("/")) {
			System.out.println("연산결과");
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		} else {
			System.out.println("연산오류");
		}
	}
	
	
}
