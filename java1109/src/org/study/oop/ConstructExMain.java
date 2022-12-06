package org.study.oop;

public class ConstructExMain {

	public static void main(String[] args) {
	
		// 생성자 선언
		ConstructEx c1 = new ConstructEx();
		c1.setUserId("m0");
		c1.setUserPw("00");
		c1.setAge(10);	
//		System.out.println(c1.toString);
		c1.info();
		
		ConstructEx c2 = new ConstructEx("m1");
		c2.setUserPw("11");
		c2.setAge(11);
		c2.info();
		
		ConstructEx c3 = new ConstructEx("m2", "22");
		c3.setAge(22);
		c3.info();
		
		ConstructEx c4 = new ConstructEx("m3", "33", 33);
		c4.info();
		
		
	}
}
