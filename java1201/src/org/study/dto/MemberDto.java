package org.study.dto;

public class MemberDto {
// DB목록을 리스트 객체에 담아 불러오기 위한 클래스  => select
	public MemberDto() {
		System.out.println("Dto 기본생성자");
	}
	
	String userId;
	String userPw;
	int age;
	
	
	public MemberDto(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}


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
	
	
	
}
