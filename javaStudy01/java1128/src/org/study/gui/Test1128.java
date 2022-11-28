package org.study.gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface in1 {
	abstract void ab1();
}

class innerClassEx {
	// 내부클래스
	
	// 인스턴스 클래스
	class InstanceClass {
		int num1;
	}
	// 스태틱 클래스
	static class StaticClass {
		static final int NUMMAX = 100;
	}
	
	void instanceMethod() {
		// 지역클래스 -> 해당 메소드에서만 접근가능
		class LocalClass {
			void m1() {
				System.out.println("지역클래스 메소드");
			}
		}
		LocalClass lc = new LocalClass();
		lc.m1();
	}
}

public class Test1128 {

	public static void main(String[] args) {
		
		// 익명클래스 생성
		
		new in1() {
			
			@Override
			public void ab1() {
				System.out.println("익명클래스의 ab1 오버라이딩 메소드");
				
			}
		}.ab1();
		
		// 람다식으로 임명클래스 생성 => 변수 선언 필요
		
		in1 i1 =()->{
			System.out.println("람다식의 ab1 오버라이딩 메소드");
		};
		
		i1.ab1();
		
		
		// List
		System.out.println("List");
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.add(40);
		lists.add(50);
		System.out.println(lists);
		
		// foreach 사용 => 개별요소 루프로 출력
		for (Integer list : lists) {
			System.out.print(list+" ");
		}
		
		System.out.println();
		
		// Iterator 사용 => 요소를 순차적으로 검사 => 인덱스가 없는 Set등의 컬렉션에서 유용
		System.out.println("Iterator");
		Iterator<Integer> iter = lists.iterator();
		while (iter.hasNext()); {
			System.out.println(iter);
		}
	}
}
