package org.study.InterfaceEx;

interface In1 {
	int MAXNUM=100;       // public static final 생략
	void in1Method();	  // public abstract 생략
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}
	
}

interface In2 {
	void in2Method();
}

interface In3 extends In1, In2 {
	void in3Method();
}

class In4 implements In3 {

	@Override
	public void in1Method() {
		System.out.println("오버라이드 메소드1");
		
	}

	@Override
	public void in2Method() {
		System.out.println("오버라이드 메소드2");
		
	}

	@Override
	public void in3Method() {
		System.out.println("오버라이드 메소드3");
		
	}
	
}



public class InterfaceExMain {

	public static void main(String[] args) {
	
		In4 in1 = new In4();
		in1.in1Method();
		in1.in2Method();
		in1.in3Method();
		in1.defaultMethod();
		int num1 = in1.MAXNUM;
		
		In1 in2 = new In4();
		in2.in1Method();
		in2.defaultMethod();
		int num2 = in2.MAXNUM;
		
		In2 in3 = new In4();
		in3.in2Method();
		
		In3 in4 = new In4();
		in4.in1Method();
		in4.in2Method();
		in4.in3Method();
		in4.defaultMethod();
		int num3 = in4.MAXNUM;
		
	}
}
