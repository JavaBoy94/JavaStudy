package org.study.oop;

public class PrivateFieldEx {

	private String userId;
	private String userPw;
	private int userAge;
	public String addr;
	
	// setter : 매개변수에 값을 집어넣고 private인 필드값을 초기화 해주는 메소드 (설정) => 해당 private 타입과 동일
	public void setUserId(String Id) {
		this.userId=Id;        // this : 해당 객체 자기자신 필드로 접근
	}
	
	// getter : 외부에서 private 필드를 호출하게 해주는 메소드 (호출)
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserPw(String Pw) {
		userPw=Pw;
	}
	
	public String getUserPw() {
		return userPw;
	}
	public void setUserAge(int Age) {
		userAge=Age;
	}
	
	public int getUserAge() {
		return userAge;
	}
}
