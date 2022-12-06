package org.study.oop;

public class CarBasic {

	private String carName;
	private int carYear;
	private int carPrice;
	
	private static final String CARPROJECT="CarWorld 2022";
	
	public CarBasic() {
		System.out.println(CARPROJECT);
	}
	public CarBasic(String carName) {
		System.out.println(CARPROJECT);
		this.carName=carName;      // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
	}
	public CarBasic(String carName, int carYear) {
		System.out.println(CARPROJECT);
		this.carName=carName;      // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
		this.carYear=carYear;      // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
	}
	public CarBasic(String carName, int carYear, int carPrice) {
		System.out.println(CARPROJECT);
		this.carName=carName;      // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
		this.carYear=carYear;      // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
		this.carPrice=carPrice;    // 매개변수로 해당 필드를 초기화하므로, 객체에서 별도 setter 작업할 필요 x
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
	
	
}
