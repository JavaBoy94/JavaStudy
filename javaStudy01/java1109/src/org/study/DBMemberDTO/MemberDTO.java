package org.study.DBMemberDTO;
// 회원가입 멤버 
public class MemberDTO {

	private String userId;
	private String userPw;
	private int userAge;
	private String userName;
	private String userAddr;
	
	// 생성자로 매개변수를 받아 setter 자동화
	public MemberDTO(String userId, String userPw, int userAge, String userName, String userAddr) {
		this.userId=userId;
		this.userPw=userPw;
		this.userAge=userAge;
		this.userName=userName;
		this.userAddr=userAddr;
		getMemberDTO();
		System.out.println();
	}
	
	// getter호출한 필드멤버를 자동출력하는 메소드 생성
	public void getMemberDTO() {
		System.out.println("----회원가입 정보----");
		System.out.println("아이디 : "+userId);
		System.out.println("비밀번호 : "+userPw);
		System.out.println("나이 : "+userAge);
		System.out.println("이름 : "+userName);
		System.out.println("주소 : "+userAddr);
	}
	
	
	
	
	// setter getter 생성
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
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
}
