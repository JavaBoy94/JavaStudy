package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		System.out.println("Map");
		
		// HashMap 생성
		HashMap<String, String> map1 = new HashMap<>(); // K : String, V : String
		
		// HashMap에 데이터 추가 => 값은 중복가능, 키는 중복 불가능
		map1.put("가수1", "김xx");
		map1.put("가수1", "이xx");
		map1.put("가수2", "김xx");
		map1.put("가수3", "이xx");
		map1.put("가수4", "이xx");
		map1.put("가수5", "박xx");
		System.out.println(map1);
		System.out.println(map1.get("가수1"));
		
		// KeySet 생성  => key를 Set으로 만든 것 (key는 중복 x)
		Set<String> set = map1.keySet();   // map1의 key들을 Set에 저장
		// Iterator 사용하여 출력 (직렬화)
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String val = map1.get(key);   // map1의 key를 이용하여 value를 불러옴
			System.out.println("키 : "+key+" 값 : "+val);
		}
		
		
	}
}
