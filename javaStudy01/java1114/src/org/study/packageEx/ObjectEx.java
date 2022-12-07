package org.study.packageEx;

class ObSub {
	private String name;
	private int age;
	
	public ObSub() {}

	public ObSub(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}


public class ObjectEx {

	public static void main(String[] args) {
		
		ObSub o1 = new ObSub();
		ObSub o2 = new ObSub();
		
		System.out.println(o1.getClass());              // 기본클래스의 전체
		System.out.println(o1.getClass().getName());    // 기본클래스의 이름
		System.out.println(o1.getClass().isArray());    // 배열(Array)인지 여부 => boolean값
		System.out.println(o1.hashCode());              // 객체의 해시코드(고유값) 반환
		System.out.println(o1.toString());              // 객체(o1)의 정보를 문자열로 변환 => equals로 비교가능
	}
}
