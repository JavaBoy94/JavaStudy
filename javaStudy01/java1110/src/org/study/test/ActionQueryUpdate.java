package org.study.test;

public class ActionQueryUpdate extends OverrideBasic {

	@Override
	public void executeQuery() {
		System.out.println("회원 수정");
//		super.executeQuery();
	}
	@Override
	public void executeQuery(String str) {
		System.out.println("수정할 회원명 : "+str);
//		super.executeQuery(str);
	}

}
