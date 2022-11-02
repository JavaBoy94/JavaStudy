package org.java.variableex;

public class Castingex {

	public static void main(String[] args) {
		System.out.println("형 변환");
		
		int i = 10;
		double d = 1.1;
		
//		int i2 = i+d;     // double 타입의 d가 int 변수에 못들어감
		double i2 = i+d;  // double 타입의 변수로 변경
		double d2 = 20+1.5;
		
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1+b2;   // byte타입 연산시 int타입으로 취급되므로 byte 변수에 못들어감
		int b3 = b1+b2;    // int 타입의 변수로 변경
		
		short s1 = 10;
//		byte s2 = s1+b1;   // short + byte >> int
		int s2 = s1+b1;    // int 타입의 변수로 변경
	
		System.out.println("강제 형변환");
		
		int j = (int) 1.1;
		System.out.println(j);    // 1.1이 아닌 1로 출력
		
		int j2 = 10+(int) 1.1;
		System.out.println(j2);   // 11.1이 아닌 11로 출력
		
		byte b4 = 10;
		byte b5 = 20;
		byte b6 = (byte)(b4+b5);  // b4+b5 를 먼저 계산 후에 byte로 강제변환
		System.out.println(b6);   // 30으로 출력
		
		
		// int num1 = 10+12.5;
		// System.out.println(num1);
		
		
	}
}
