package org.study.operatorEx;

public class Operator12 {

	public static void main(String[] args) {

		System.out.println("단항연산자");

		int i = 10;

		System.out.println(i++); // 10 선처리 후증가
		System.out.println(i);   // 11
		System.out.println(++i); // 12 선증가 후처리
		System.out.println(i);   // 12
		System.out.println(i--); // 12 선처리 후감소
		System.out.println(i);   // 11
		System.out.println(--i); // 10 선감소 후처리
		System.out.println();

		// i++ (선처리 후증가)
		int num1 = 10;

		System.out.println(num1);
		System.out.println(num1++);
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		System.out.println();

		// ++i (선증가 후처리)
		System.out.println(num1);
		System.out.println(++num1);
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		System.out.println();

		// i-- (선처리 후감소)
		int num2 = 10;

		System.out.println(num2);
		System.out.println(num2--);
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		System.out.println();

		// --i (선감소 후처리)
		System.out.println(num2);
		System.out.println(--num2);
		System.out.println(num2);
		--num2;
		System.out.println(num2);
		System.out.println();
		
	}
}
