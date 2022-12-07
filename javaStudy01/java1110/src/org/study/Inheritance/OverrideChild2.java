package org.study.Inheritance;

public class OverrideChild2 extends OverrideParent {

	@Override
	public void excuteQuery() {
		System.out.println("Override메소드2");
		super.excuteQuery();
	}

}
