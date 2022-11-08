package org.study.oop;

public class ConstructEx01 {

	// getter, setter 단축키 : alt + shift + S
	private String userId;
	private String userPw;
	private int age;
	
	// 컴파일러가 자동으로 기본생성자를 생성 (클래스명과 동일), return값이 생략되어있으므로 반환타입은 void지만 선언은 하지않음
	public ConstructEx01() {
		this("s111");            // 메소드 오버로딩1을 호출. 다른 생성자를 호출할땐 this를 통해 첫째 줄에서 호출해야함
		System.out.println("기본생성자");
	}
	
	// 메소드 오버로딩 1 (매개변수 형식이 다르면 같은 메소드명 사용 가능) => 생성자에서 특히 많이 사용
	public ConstructEx01(String userId) {
		this("m111", "1111");    // 메소드 오버로딩2를 호출
		System.out.println(userId);
	}
	
	// 메소드 오버로딩 2
	public ConstructEx01(String userId, String userPw) {
		System.out.println("생성자 ConstructEx01 "+userId+" "+userPw);
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
