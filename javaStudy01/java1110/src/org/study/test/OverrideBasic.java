package org.study.test;

public class OverrideBasic {

	public void executeQuery() {
		System.out.println("기본메소드");
	}
	
	public void executeQuery(String str) {
		System.out.println("오버로딩 메소드");
	}
}
