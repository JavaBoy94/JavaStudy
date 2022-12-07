package org.study.package1;

//접근지정자 생략 => default 클래스
class ModifyEx02 {

	public int num1_1;
	private int num2_1;
	protected int num3_1;
	int num4_1;   // default로 설정
	
	
	
	// setter&getter 생성 (private)
	public void setNum2_1(int num2_1) {
		this.num2_1 = num2_1;
	}
	
	public int getNum2_1() {
		return num2_1;
	}
}
