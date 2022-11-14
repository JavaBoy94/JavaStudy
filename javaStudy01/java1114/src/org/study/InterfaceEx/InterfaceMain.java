package org.study.InterfaceEx;

interface A {
	void a1();
}

interface A2 {
	void a2();
}

// 인터페이스간 상속에는 implements가 아닌 extends 사용 (다중상속 가능)
interface B extends A, A2 {
	void b1();
}

class AB implements B {

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceMain {

	public static void main(String[] args) {
		
		AB a = new AB();
	}
}
