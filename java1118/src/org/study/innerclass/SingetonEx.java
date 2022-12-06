package org.study.innerclass;

public class SingetonEx {

	public static void main(String[] args) {
		
		// 같은 객체를 계속 만들때마다 메모리(힙)에 새로 만들어짐 
//		new Dao();
//		new Dao();
		
		// 싱글톤 => 객체(인스턴스)를 한번만 생성
		Dao dao = Dao.getInstance();
		
		dao.insert();
		dao.delete();
		dao.update();
		dao.select();
	}
}
