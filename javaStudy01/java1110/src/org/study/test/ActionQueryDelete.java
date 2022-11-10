package org.study.test;

public class ActionQueryDelete extends OverrideBasic {
@Override
public void executeQuery() {
	System.out.println("회원 탈퇴");
//	super.executeQuery();
}
@Override
	public void executeQuery(String str) {
		System.out.println("삭제할 회원명 : "+str);
//		super.executeQuery(str);
	}
}
