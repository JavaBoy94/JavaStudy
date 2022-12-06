package org.study.oop;

public class Car {

	// 필드 생성
	public String carName;
	public int carYear;	
	public int carPrice;
	public String carColor;
	public int carCC;
	
	// 기본생성자 => 생략 (기본생성자로 생성)
	
	// 메소드 생성 (인스턴스 메소드 : new로 새로운 인스턴스를 생성해야 사용가능한 메소드)
	public void carInfo() {
		System.out.println("====차량정보====");
		System.out.println("차종 : "+carName);
		System.out.println("연식 : "+carYear);
		System.out.println("가격 : "+carPrice);
		System.out.println("색상 : "+carColor);
		System.out.println("배기량 : "+carCC);
	}
}
