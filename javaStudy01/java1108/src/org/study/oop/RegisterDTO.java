package org.study.oop;

public class RegisterDTO {

	// setters, getters 생성

	private int user_no;
	private String username;
	private String userphone;
	private String address;
	private String grade;
	private String city;
	

	public void setUser_No(int userNo) {
		user_no = userNo;
	}

	public int getUesr_No() {
		return user_no;
	}

	public void setUserName(String userName) {
		username = userName;
	}

	public String getUserName() {
		return username;
	}

	public void setUserPhone(String userPhone) {
		userphone = userPhone;
	}

	public String getUserPhone() {
		return userphone;
	}

	public void setAddress(String Address) {
		address = Address;
	}

	public String getAddress() {
		return address;
	}

	public void setGrade(String Grade) {
		grade = Grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setCity(String City) {
		city = City;
	}

	public String getCity() {
		return city;
	}
}