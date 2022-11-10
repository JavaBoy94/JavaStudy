package org.study.polymorphism;

class Parent {
	void excuteQuery() {
		System.out.println("SQL실행");
	}
}

class child1 extends Parent {
	@Override
	void excuteQuery() {
		System.out.println("SQL 1");
//		super.excuteQuery();
	}
}

class child2 extends Parent {
	@Override
	void excuteQuery() {
		System.out.println("SQL 2");
//		super.excuteQuery();
	}
}

public class polymorphismEx2 {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.excuteQuery();
		
		parent = new child1();
		parent.excuteQuery();
		
		parent = new child2();
		parent.excuteQuery();
		
	}
}
