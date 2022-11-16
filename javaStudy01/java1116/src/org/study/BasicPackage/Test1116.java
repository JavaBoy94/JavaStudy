package org.study.BasicPackage;

public class Test1116 {

	public static void main(String[] args) {
		
		// 표준입출력
//		System.in  => 입력
//		System.out => 출력
		
		// Class => 특정 클래스를 찾아 JDBC에 로드
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("DB Connect Success !");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("DB Connect Fail !");
//		}
		
		// Wrapper 클래스
		int i = 10;
		
		Integer i1 = new Integer(i);  // 박싱
		int i2 = i1.intValue();       // 언박싱
		
		Integer i3 = i;   // 자동박싱
		int i4 = i2;      // 자동언박싱
		
		// String 문자열 => 수정불가능
		String str = "java 2022 Project";
		
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.contains("e"));
		System.out.println(str.concat(" Wow~~"));
		System.out.println(str.replace("java", "Oracle"));
	
		// split
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);
		
		System.out.println("for========");
		for (int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		
		System.out.println("foreach=====");
		for (String arr:strArr) {
			System.out.println(arr);
		}
		
		// substring
		System.out.println("substring======");
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 9));    // 끝지점 앞 인덱스까지만 출력됨 (시작점 ~ 끝점-1)
		
	}
}
