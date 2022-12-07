package org.study.innerclass;

public class Dao {
	// 싱글톤 패턴
	
	// 접근제한자가 private인 생성자
	private Dao() {
		System.out.println("Dao 기본생성자");
	}
	
	
	// 외부클래스(Dao) 안에 내부 클래스(InnerClass) 생성
	private static class InnerClass {
		// 인스턴스를 한번만 생성
		private static final Dao INSTANCE = new Dao();
	}
	
	// static은 메모리에 최초 한번만 할당되고 변하지 않음
	public static Dao getInstance() {
		// public 메소드의 리턴값으로 private 내부클래스 접근 가능
		return InnerClass.INSTANCE;
	}
	
	public void insert() {}
	public void delete() {}
	public void update() {}
	public void select() {}
}
