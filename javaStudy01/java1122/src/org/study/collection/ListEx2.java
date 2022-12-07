package org.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx2 {

	public static void main(String[] args) {
	
		// 자바 1.5 버전 이후 => 축약 및 자동 형변환 지원
//		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();
		
		list2.add("java");
		String str = list2.get(0);
		
	}
}
