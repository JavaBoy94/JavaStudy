package org.study.collection;

import java.util.LinkedList;

public class QueueEx {

	public static void main(String[] args) {
		
		System.out.println("Queue");
		
		// queue의 구현객체(LinkedList) 생성
		LinkedList<String> qu = new LinkedList<>();
		
		// 요소추가 (add)
		qu.add("하나");
		qu.add("둘");
		qu.add("셋");
		qu.add("넷");
		qu.add("다섯");
		System.out.println(qu);
		
		// 첫번째 요소 반환 (peek)
		System.out.println(qu.peek());
		
		// 첫번째 요소 제거 (poll)
		qu.poll();
		System.out.println(qu);
		
		// 특정 요소 제거 (remove)
		qu.remove("다섯");
		System.out.println(qu);
		
		// 모든 요소 제거
		qu.clear();
		System.out.println(qu);
	}
}
