package org.study.BasicPackage;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		
		Integer i10 = new Integer(10);   // 박싱
		int i11 = i10.intValue();        // 언박싱
		
		Integer i20 = 10;    // 자동 박싱 (자바에서 자료의 타입을 자동으로 인식) 
		int i21 = i20;       // 자동 언박싱
		
		System.out.println("문자열 : "+ i10.toString());
		
		Character ch10 = new Character('a');
		char ch11 = ch10.charValue();
		
		Character ch20 = 'a';
		char ch21 = ch20;
		
		Boolean bool10 = new Boolean(false);
		boolean bool11 = bool10.booleanValue();
		
		Boolean bool20 = false;
		boolean bool21 = bool20;
		
		Float f10 = new Float(1.1f);
		float f11 = f10.floatValue();
		
		Float f20 = 1.1f;
		float f21 = f20;
		
		String sF10 = f10.toString();
		System.out.println("문자열 : "+ sF10);
		
		Double d10 = new Double(1.1);
		double d11 = d10.doubleValue();
		
		Double d20 = 1.1;
		double d21 = d20;
		
		Short s10 = new Short((short) 10);
		short s11 = s10.shortValue();
		
		Short s20 = (short)10;
		short s21 = s20;
		
	}
}
