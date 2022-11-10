package org.study.Inheritance;

public class OverrideChild3 extends OverrideParent {

	@Override
	public void excuteQuery() {
		System.out.println("Override메소드3");
		super.excuteQuery();
	}
}
