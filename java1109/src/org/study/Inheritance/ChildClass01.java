package org.study.Inheritance;
// extends로 ParentClass를 상속 (+ Object)
public class ChildClass01 extends ParentClass {
	
	// 자식클래스 멤버 > 부모클래스 멤버
	public int childNum1;
	public int childNum2;
	
	public void childMethod() {
		System.out.println("child01Method");
	}
}
