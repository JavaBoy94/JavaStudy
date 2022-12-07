package org.study.oop;

public class CarBasicMain {

	public static void main(String[] args) {
		
		// 필드를 초기화하고 콘솔에 출력
		// getter, setter 사용
		// 기본생성자
		// 생성자 2
		// 생성자 3
		// 생성자 4
		
		CarBasic c1 = new CarBasic();
		c1.setCarName("ACar");
		c1.setCarYear(2019);
		c1.setCarPrice(4000);
		System.out.println("CarName : "+c1.getCarName());
		System.out.println("CarYear : "+c1.getCarYear());
		System.out.println("CarPrice : "+c1.getCarPrice());
		System.out.println();
		
		CarBasic c2 = new CarBasic("BCar");
		c2.setCarYear(2020);
		c2.setCarPrice(5000);
		System.out.println("CarName : "+c2.getCarName());
		System.out.println("CarYear : "+c2.getCarYear());
		System.out.println("CarPrice : "+c2.getCarPrice());
		System.out.println();

		CarBasic c3 = new CarBasic("CCar", 2021);
		c3.setCarPrice(6000);
		System.out.println("CarName : "+c3.getCarName());
		System.out.println("CarYear : "+c3.getCarYear());
		System.out.println("CarPrice : "+c3.getCarPrice());
		System.out.println();
		
		CarBasic c4 = new CarBasic("DCar", 2022, 7000);
		System.out.println("CarName : "+c4.getCarName());
		System.out.println("CarYear : "+c4.getCarYear());
		System.out.println("CarPrice : "+c4.getCarPrice());

	}
}
