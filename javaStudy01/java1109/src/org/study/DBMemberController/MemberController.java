package org.study.DBMemberController;
import java.util.Scanner;

//new 생성시 자동으로 import
import org.study.DBMemberCommend.MemberJoinCommend;
import org.study.DBMemberDTO.MemberDTO;  

public class MemberController {

	public static void main(String[] args) {
		
//		MemberJoinCommend commend1 = new MemberJoinCommend();
//		MemberJoinCommend commend2 = new MemberJoinCommend("제목");
//		
//		// 회원가입 MemberDTO 만들기 (ID중복 안되게)
//		// 매개변수를 넣으면 자동으로 setter처리
//		MemberDTO dto1 = new MemberDTO("m1", "11", 29, "ps", "seoul");
//		MemberDTO dto2 = new MemberDTO("m2", "22", 30, "ps", "seoul");
//		MemberDTO dto3 = new MemberDTO("m3", "33", 31, "ps", "seoul");
//		MemberDTO dto4 = new MemberDTO("m4", "44", 32, "ps", "seoul");
//		MemberDTO dto5 = new MemberDTO("m5", "55", 33, "ps", "seoul");
//	
//		// 1. 배열+for문으로 회원정보 자동출력 
//		MemberDTO[] member = new MemberDTO[5];
//		
//		member[0] = dto1;
//		member[1] = dto2;
//		member[2] = dto3;
//		member[3] = dto4;
//		member[4] = dto5;
//		
//		for (int i=0; i<member.length; i++) {
//			String Id = member[i].getUserId();
//			String Pw = member[i].getUserPw();
//			int Age = member[i].getUserAge();
//			String Name = member[i].getUserName();
//			String Addr = member[i].getUserAddr();
//			
//			System.out.println("---회원가입 정보---");
//			System.out.println("아이디 : "+Id);
//			System.out.println("비밀번호 : "+Pw);
//			System.out.println("나이 : "+Age);
//			System.out.println("이름 : "+Name);
//			System.out.println("주소 : "+Addr);
//			System.out.println();
//		}
//		
//		// 2. 만들어놓은 getter 자동출력 메소드 사용
//		dto1.getMemberDTO();
//		dto2.getMemberDTO();
//		dto3.getMemberDTO();
//		dto4.getMemberDTO();
//		dto5.getMemberDTO();
		
		
		// 스캐너 사용
		// while문으로 한번 돌 때마다 DTO 생성
		
		Scanner input = new Scanner(System.in);
		System.out.println("--- 회원정보 부르소~ ---");
		
		System.out.print("아이디 입력 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 입력 : ");
		String userPw = input.next();

		System.out.print("나이 입력 : ");
		int userAge = input.nextInt();

		System.out.print("이름 입력 : ");
		String userName = input.next();

		System.out.print("주소 입력 : ");
		String userAddr = input.next();
		
		MemberDTO dto6 = new MemberDTO(userId, userPw, userAge, userName, userAddr);
		
		dto6.getMemberDTO();
		
	}
}
