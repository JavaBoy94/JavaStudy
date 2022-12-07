package org.study.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1124 {

	public static void main(String[] args) {
		
		Stack<Integer> st1 = new Stack<>();
		
		// 요소추가 (int형 자동박싱)
		st1.push(10); 
		System.out.println(st1);
		st1.push(20); 
		System.out.println(st1);
		st1.push(30); 
		System.out.println(st1);
		st1.push(40); 
		System.out.println(st1);
		st1.push(50);
		System.out.println(st1);
		
		System.out.println();
		
		// 요소제거 (마지막 인덱스부터) => 후입선출
		st1.pop();
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		
		System.out.println("-------------------------");
		
		Queue<Integer> q1 = new LinkedList<>();
		
		// 요소추가
		for (int i=0; i<5; i++) {
			q1.add(i*10+10);
			System.out.println(q1);
		}
		System.out.println();
		// 요소제거 (첫 인덱스부터) => 선입선출
		for (int i=0; i<5; i++) {
			q1.poll();
			System.out.println(q1);
		}
		
	}
}
