package org.study.oop;

public class ConstructEx {

	private String userId;
	private String userPw;
	private int age;
	

	// 생성자 => 반환타입 : void => 생략
	// 매개변수를 받는 생성자의 경우, 인스턴스멤버(필드)를 초기화할 수 있음 (this. 사용)
	// 매개변수를 받아 private멤버를 초기화할 경우 setter 불필요 (생성자 안에서 이미 초기화되었으므로)
	public ConstructEx() {
		System.out.println("기본생성자");
	}
	
	public ConstructEx(String userId) {
		System.out.println("생성자 1");
		this.userId=userId;
	}
	
	public ConstructEx(String userId, String userPw) {
		System.out.println("생성자 2");
		this.userId=userId;
		this.userPw=userPw;
	}
	
	public ConstructEx(String userId, String userPw, int age) {
		System.out.println("생성자 3");
		this.userId=userId;
		this.userPw=userPw;
		this.age=age;
	}
	
	
	// getters, setters 생성
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
	
	
//	@Override
//	public String toString() {
//		String info="아이디 : "+userId+", 비밀번호 : "+userPw+", 나이 : "+age;
//		return info;
//	}
	
	public void info() {
		System.out.println("아이디 : "+userId+", 비밀번호 : "+userPw+", 나이 : "+age);
	}
	
	
}
