package org.study.Inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		
		
//		ParentClass p1 = new ParentClass();
				
		ChildClass01 c1 = new ChildClass01();
		
		// ChildClass01 필드 참조
		c1.childNum1=10;
		c1.childNum2=20;
		c1.childMethod();
		
		// ParentClass 필드 참조
		c1.num1=30;
		c1.num3=40;
		c1.num4=50;
		
	}
}
