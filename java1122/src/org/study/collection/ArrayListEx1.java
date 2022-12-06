package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(new Integer(10));
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		// foreach
		for (Integer in : list1) {  // foreach는 자동으로 0번부터 순차적으로 실행
			System.out.println(in);  
		}
		
		System.out.println();
		
		// Iterator 사용
		Iterator<Integer> iter1 = list1.iterator();
		
		while (iter1.hasNext()) {
			Integer in = iter1.next();
			System.out.println(in);
		}
		
		System.out.println();
		
		System.out.println(list1.size());
		System.out.println(list1.add(1000));
		list1.add(0, 500);
		System.out.println(list1);
		
	}
}
