package org.study.collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		System.out.println("Vector");
		
		// List<E>인터페이스를 부모클래스로 상속받는 클래스
		// List처럼 순서를 가지며, 길이가 자동으로 조절됨
		// 객체를 요소로 가짐 => 기본자료형 불가능
		// 중복값 허용
		
		// 벡터객체 생성
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(1000); // 1000이 Integer로 자동박싱되어 추가 
		v1.add(2000); 
		v1.add(3000); 
		v1.add(4000); 
		v1.add(5000);
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);

		// 벡터의 모든 요소를 출력
		
		for (int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i));   // get(index) => 해당 인덱스요소 리턴
		}
		
		System.out.println();
		
		// foreach  사용 => 컬렉션의 모든 요소를 출력
		
		for (Integer el : v1) {
			System.out.print(el+" ");
		}
		
		System.out.println();
		
		v1.add(1,1500);
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);
		
		System.out.println();
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(1111);
		v2.add(2222);
		v2.add(3333);
		v2.add(4444);
		v2.add(5555);
		
		for (int el2 : v2) {
			System.out.print(el2+" ");
		}
		
		System.out.println();
		
		// v1에 v2 추가
		
		v1.addAll(v2);
		
		for (int i : v1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);
		
		System.out.println(v1.contains(10));
		System.out.println(v1.contains(v2.get(0)));
		
		if (!v1.contains(10)) {
			System.out.println("10이 포함되어 있지 않습니다.");
		} else {
			System.out.println("10이 포함되어 있습니다!");
		}
		
		System.out.println(v1.elementAt(10));
		System.out.println(v1.indexOf(3000));
		System.out.println(v1.indexOf(100));
		System.out.println(v1.isEmpty());
		
		System.out.println();
		
		v1.remove(0);
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);
		
		v1.remove(new Integer (5000));
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);
		
		System.out.println();
		
		v1.removeAll(v2);
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 용량 : "+v1.capacity());
		System.out.println("벡터 요소 : "+v1);
		
		System.out.println();
		
		v1.clear();
		System.out.println("벡터 길이 : "+v1.size());
		System.out.println("벡터 요소 : "+v1);
		System.out.println(v1.isEmpty());
	}
}
