package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		System.out.println("Map");
		
		// 1. HashMap 객체 생성
		HashMap<Integer, String> map1 = new HashMap<>();
		
		// 2. 요소추가 (put, 자동박싱)
		map1.put(1, "user1");
		map1.put(2, "user2");
		map1.put(3, "user3");
		map1.put(4, "user4");
		map1.put(5, "user5");
		
		// 3. Key값을 저장 => KeySet 생성
		Set<Integer> keys = map1.keySet();   // map1의 키값을 set으로 저장 (KeySet)
		
		// 4. keySey 출력 => 1) keySet을 ArrayList로 만들거나, 2) Iterator 사용 (Set은 인덱스가 없으므로..)
		Iterator<Integer> iter = keys.iterator();   // Iterator의 타입은 map1의 key 타입 (Integer)
		while (iter.hasNext()) {
			Integer key = iter.next();   // key : keySet의 요소 (map1의 key값)
			String val = map1.get(key);  // value : map1에서 key에 대응되는 value값
 			
			System.out.println("key : "+key+" / value : "+val);
		}
		
		
	}
}
