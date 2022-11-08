package org.study.oop;

public class MemberDTO {

	// 스캐너로 회원가입 만들기
	// 회원정보를 콘솔에 출력
	
	private String userId;
	private String userPw;
	private int age;
	
	// setter, getter
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	
}
