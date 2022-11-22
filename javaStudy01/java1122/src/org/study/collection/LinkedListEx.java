package org.study.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		System.out.println("LinkedList");
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);

		
		// LinkedList 객체 생성
		LinkedList<Integer> i1 = new LinkedList<>();
		LinkedList<Integer> i2 = new LinkedList<>(a1);   // 다른 컬렉션으로 초기화 가능
		
		for (int i : i2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(10);   // 가장 앞에 데이터 추가
		list.add(30);   		
		list.add(40);   	
		list.addLast(50);    // 가장 마지막에 데이터 추가
		list.add(1, 20);     // 해당 인덱스에 데이터 추가
		
		for (int i : list) {
			System.out.print(i+" ");
		}
		
//		list.removeFirst();  // 가장 앞의 데이터 제거
//		list.removeLast();   // 가장 마지막의 데이터 제거
//		list.remove(1);      // 1번째 인덱스의 데이터 제거
//		list.remove();       // 인덱스 생략시 0번째 데이터 제거
	}
}
