package org.study.BasicPackage;

class Obj1 {
	int num1;
}

public class ObjectEx {

	public static void main(String[] args) {
		
		Obj1 ob1 = new Obj1();
		Obj1 ob2 = new Obj1();
		
		System.out.println(ob1.equals(ob2));   // heap에 저장된 주소값이 다르므로 false 출력
		System.out.println(ob1.hashCode());    // heap에 저장된 ob1의 메모리 주소값 리턴 
		System.out.println(ob2.hashCode());    // heap에 저자된 ob2의 메모리 주소값 리턴 
		System.out.println("ina".hashCode());
		System.out.println(ob1.getClass());
		System.out.println(ob2.getClass());    // ob1, ob2 모두 같은 클래스의 인스턴스이므로 클래스정보가 동일
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());
		System.out.println(ob1.toString());    // 해당 클래스의 객체를 문자열로 리턴
		
	}
}
