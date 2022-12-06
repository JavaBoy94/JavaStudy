package org.study.test;

public class ActionQuerySelect extends OverrideBasic {
@Override
public void executeQuery() {
	System.out.println("회원 조회");
//	super.executeQuery();
}
@Override
	public void executeQuery(String str) {
		System.out.println("조회할 회원명 : "+str);
//		super.executeQuery(str);
	}
}
