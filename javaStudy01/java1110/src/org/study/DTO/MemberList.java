package org.study.DTO;

public class MemberList {

	// 필드
	private String userId;
	private String userPw;
	private int age;
	private String email;
	
	// 생성자
	public MemberList(String userId, String userPw, int age, String email) {
		super();  // Object클래스의 기본생성자 상속
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		this.email = email;
	}
	
	
	// setter & getter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
