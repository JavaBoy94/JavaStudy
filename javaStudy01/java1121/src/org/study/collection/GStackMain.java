package org.study.collection;

public class GStackMain {
	
	public static void main(String[] args) {
		
		// Integer타입의 스택 객체 생성 -> 요소 타입이 Integer
		GStack<Integer> gS1 = new GStack<Integer>();
		
		// push 메소드 실행하여 스택에 요소 추가
		for(int i=0; i<gS1.oStack.length; i++) {
			// 10~100까지 10씩 증가하여 입력
			int i2 = i*10+10;
			gS1.push(i2);
			System.out.println(gS1.oStack[i]);
		}
		
		// pop 메소드 실행하여 모든 스택요소 출력
		for(int i=0; i<gS1.oStack.length; i++) {
			System.out.println(gS1.pop());
		}
		
		
	}
}
