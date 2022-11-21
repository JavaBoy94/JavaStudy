package org.study.collection;

import java.util.Date;

public class ClassType {
	// 인스턴스멤버 : new로 생성된 객체로 접근하여 멤버 호출
	// 클래스멤버 : 클래스로 접근하여 static 멤버 호출 => static은 클래스에서만 한번 선언되고 값이 변하지 않기때문

	public int num1;
	public String name;
	public Object obj;
	public Date day;
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
