package org.study.InterfaceEx;

abstract class Ab1 {
	int num1;
	abstract void ab1M();
}

abstract class Ab2 extends Ab1 {
	int num2;
	abstract void ab2M();
}

//class ABC extends Ab1, Ab2 => 추상클래스는 단일상속만 가능 
class Abc extends Ab2 {

	@Override
	void ab2M() {
		System.out.println("ab2M");
		
	}

	@Override
	void ab1M() {
		System.out.println("ab1M");
		
	}
	
}


public class AbstractExMain extends Abc{   // 추상클래스의 구현객체를 상속

	public static void main(String[] args) {
		
		Ab1 ab1 = new Abc();
		Ab2 ab2 = new Abc();
		Abc abc = new Abc();
		
		
		
	}

}
