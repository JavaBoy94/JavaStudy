package org.study.oop;

public class HCar {

	public static void main(String[] args) {
		
		// 여러 클래스를 조합하기
		
		// 자동차 기본정보 클래스 생성
		Car h1 = new Car();
		
		h1.carName = "HCar";
		h1.carYear = 2023;
		h1.carPrice = 5800;
		h1.carColor = "Black";
		h1.carCC = 3000;
		
		h1.carInfo();
		
		// 범퍼 클래스 생성
		CarBumper bumper1 = new CarBumper();
		
		bumper1.carBumperName="HCar Bumper";
		bumper1.carBumperPrice=200;
		
		// 핸들 클래스 생성
		CarHandle handle1 = new CarHandle();
		
		handle1.carHandleName="HCar Handle";
		handle1.carHandlePrice=50;
		
		// 체인 클래스 생성
		CarChain Chain1 = new CarChain();
		
		Chain1.carChainName ="HCar Chain";
		Chain1.carChainPrice=100;
		
		
	}
}
