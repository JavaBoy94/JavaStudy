package org.study.oop;

public class PrivateFieldExMain {

	public static void main(String[] args) {
		
		PrivateFieldEx ins1 = new PrivateFieldEx();
		
		ins1.addr="노원구";   // private 접근제한자는 해당 클래스 에거만 접근가능 => 보안 및 손상방지 목적 (캡슐화)
		                    // private를 외부에서 접근가능하게 하는 메소드 => getter, setter
		
		ins1.setUserId("m111");              // setter메소드로 private 필드 초기화
		String Id = ins1.getUserId();        // getter메소드로 초기화된 private 필드를 호출하여 변수에 저장
		System.out.println(Id);
		
		ins1.setUserPw("1234");
		String Pw = ins1.getUserPw();
		System.out.println(Pw);
//		System.out.println(ins1.getUserPw());
		
		ins1.setUserAge(29);
		int Age = ins1.getUserAge();
		System.out.println(Age);
	}
}
