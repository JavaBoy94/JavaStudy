package org.study.oop;

public class Calculator {

	// 계산기 클래스 만들기
	// +-*/% 연산
	// 매개변수 3개 (num1, num2, op)
	public int num1;
	public int num2;
	public String op;
	
	public static final String PROJECTNAME="caculator";
	
	public void sum() {
		System.out.println("연산결과 : "+num1+" + "+num2+" = "+(num1+num2));
	}
	public void sub() {
		System.out.println("연산결과 : "+num1+" - "+num2+" = "+(num1-num2));
	}
	public void mult() {
		System.out.println("연산결과 : "+num1+" * "+num2+" = "+(num1*num2));
	}
	public void div() {
		System.out.println("연산결과 : "+num1+" / "+num2+" = "+((double)num1/num2));
	}
	public void rem() {
		System.out.println("연산결과 : "+num1+" % "+num2+" = "+(num1%num2));
	}
}
