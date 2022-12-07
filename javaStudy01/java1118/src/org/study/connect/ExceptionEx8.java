package org.study.connect;

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			// 예외 발생시키기
			throw new Exception();
//			System.out.println(2);    // 예외가 발생했으므로 해당 출력문은 실행X
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("프로그램 정상 종료");
	}
}
