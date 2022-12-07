package org.study.DBMemberCommend;

public class DBMemberInsert extends DBCommend {

	// 부모클래스의 메소드를 재정의할 때 오버라이드
	// 선언부가 동일해야 함, 구현부에서 재정의
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
	}
}
