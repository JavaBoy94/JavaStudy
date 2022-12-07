package org.study.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		System.out.println("Stack");
		
		// stack 객체 생성
		
		Stack<String> st = new Stack<>();
		
		// 요소추가 (push)
		st.push("el1");
		st.push("el2");
		st.push("el3");
		st.push("el4");
		st.push("el5");
		
		// 요소 반환 (peek) 가장 먼저 빠져나갈 예정인 요소 (LIFO)
		System.out.println(st.peek());  // 스택의 가장 꼭대기(peek)요소(5)를 반환 => 마지막 요소
		System.out.println(st);
		
		// 요소제거 (pop)
		st.pop();                // 마지막 요소(peek)를 제거
		System.out.println(st);
		
		// 요소 위치 검색 (search)  => 가장 윗부분(마지막부분)의 위치를 1로 하여 순차적으로 내려감 
		System.out.println(st.search("el1"));
		System.out.println(st.search("el2"));
		System.out.println(st.search("el3"));
		System.out.println(st.search("el4"));
		System.out.println(st.search("el5"));
		
		
	}
}
