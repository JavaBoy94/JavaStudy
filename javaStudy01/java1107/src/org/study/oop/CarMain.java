package org.study.oop;

public class CarMain {

	public static void main(String[] args) {
		
		Car hCar = new Car();
		
		hCar.carName = "HCar";
		hCar.carYear = 2022;
		hCar.carPrice = 3000;
		hCar.carColor = "Black";
		hCar.carCC = 2000;
		
		hCar.carInfo();
		
		System.out.println("-----------------------");
		
		Car mCar = new Car();
		
		mCar.carName = "MCar";
		mCar.carYear = 2019;
		mCar.carPrice = 2400;
		mCar.carColor = "White";
		mCar.carCC = 2000;
		
		mCar.carInfo();
		
		System.out.println(hCar.getClass()==mCar.getClass());   // 같은 클래스이므로 true로 출력
		
	}
}
