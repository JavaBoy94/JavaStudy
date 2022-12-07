package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		
		System.out.println("객체형 반복문");
		
		// 객체형, 컬렉션 반복문
		Vector<String> v0 = new Vector<String>();
		
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		// for문으로 모든 벡터요소 출력
		
		for (int i=0; i<v0.size(); i++) {
			System.out.println(v0.get(i));
		}
		
		System.out.println();
		
		// foreach문으로 모든 벡터요소출력
		for (String i : v0) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Iterator(반복자) => 객체형 타입에 특화
		
		Iterator<String> iter = v0.iterator();
		
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
	}
}
