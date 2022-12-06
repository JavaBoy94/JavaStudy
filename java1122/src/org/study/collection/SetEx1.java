package org.study.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {

	public static void main(String[] args) {
		
		System.out.println("Set");
		
		// HashSet 생성
		HashSet<String> set = new HashSet<>();
		set.add("JAVA");
		set.add("DATABASE");
		set.add("WEB");
		set.add("SERVLET");
		set.add("JSP");
		set.add("SPRING");
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println();
		
		set.remove("WEB");
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println();
		
		// Iterator 생성
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		System.out.println();
		
		set.clear();
		System.out.println(set.size());
		System.out.println("set이 비어있는가? => "+set.isEmpty());
	}
}
