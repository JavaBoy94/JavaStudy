package org.study.package1;

// 접근지정자가 public인 클래스
public class ModifyEx01 {

	// 필드
	public int num1;
	private int num2;
	protected int num3;
	int num4;    // default로 설정
	
	// 메소드
	public void m1() {
		System.out.println("m1");
	}
	private void m2() {
		System.out.println("m2");
	}
	void m3() {
		System.out.println("m3");
	}
	protected void m4() {
		System.out.println("m4");
	}

	
	
	// setter&getter 생성 (private)
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
	}
	
	
}
