package org.study.Inheritance;

public class OverrideChild1 extends OverrideParent {

@Override    // 상속받은 상태에서 ctrl+ 스페이스 하면 자동으로 부모메소드 오버라이드
public void excuteQuery() {
	System.out.println("Override메소드1");
	super.excuteQuery();
}
	
}
