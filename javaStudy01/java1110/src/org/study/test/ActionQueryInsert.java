package org.study.test;

public class ActionQueryInsert extends OverrideBasic {
@Override
public void executeQuery() {
	System.out.println("회원 가입");
//	super.executeQuery();
}
@Override
	public void executeQuery(String str) {
		System.out.println("가입할 회원명 : "+str);
//		super.executeQuery(num1);
	}
}
