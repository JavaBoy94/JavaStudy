package org.study.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1125 {

	public static void main(String[] args) {
		// List 순서가 있는 데이터의 집합(컨테이너). 주로 ArrayList로 구현
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		for (Integer el : list) {   // list의 요소를 순서대로 하나씩 el에 담을때마다 메소드 작업 수행 => 실제 el이라는 객체가 생성되어 넣은건 아님 (반복작업을 하기위한 용도)
			System.out.println(el);
		}
		
		// Set => 순서가 없는 데이터들의 집합 (주머니) => 데이터 중복 불가능. 
		// 인덱스가 없기때문에 for문 사용불가 => 요소 하나씩 순회하여 출력하려면 Iterator를 사용한다.
		Set<Integer> set = new HashSet<>();   // => 고유값(Hash코드)순으로 정렬됨
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		
		
		List<Integer> ar = new ArrayList<Integer>(set);
		Collections.sort(ar);
		System.out.println(ar);
//		Collections.sort(ar, Collections.reverseOrder());
//		System.out.println(ar);
		
		// Iterator 사용
		Iterator<Integer> iter = ar.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// map => 키:값 (키는 중복불가능, 값은 중복가능)
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "oracle");
		map.put(3, "hello");
		map.put(4, "world");
		map.put(5, "yaho");
		System.out.println(map);
		
		// map도 키:값 단위로 개별 요소 출력은 불가능 (특정 key에 해당하는 value만 개별출력 가능)
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
		
		// map 출력 => keyset 생성 후 iterator로 '키:값'형태 출력
		Set<Integer> ks = map.keySet();
		
		Iterator<Integer> iter2 = ks.iterator();
		System.out.print("{"+" ");
		while (iter2.hasNext()) {
			Integer key = iter2.next();
			String val = map.get(key);  // map에서 key의 값 (키값)에 해당하는 value 반환
			
			System.out.print("{"+key+":"+val+"}"+" ");
		}
		System.out.print("}");
	}
}
