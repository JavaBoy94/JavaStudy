package org.study.BasicPackage;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper 클래스");
		
		System.out.println("기본타입 => Wrapper클래스 (박싱)");
		Byte b2 = new Byte((byte) 10);
		Short s2 = new Short((short) 10);
		Integer i2 = new Integer(10);
		Long l2 = new Long(10);
		Float f2 = new Float(1.1f);
		Double d2 = new Double(1.1);
		Character ch2 = new Character('a');
		Boolean bool2 = new Boolean(false);
		
		System.out.println(b2.intValue());   //  클래스이기 때문에 메소드 접근 가능
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);
		
		System.out.println();
		
		System.out.println("Wrapper클래스 => 기본자료형 (언박싱)");
		byte b3 = b2.byteValue();  // 박싱한 객체(Wrapper클래스)를 다시 기본자료형 변수에 대입
		short s3 = s2.shortValue();
		int i3 = i2.intValue();
		long l3 = l2.longValue();
		float f3 = f2.floatValue();
		double d3 = d2.doubleValue();
		char ch3 = ch2.charValue();
		boolean bool3 = bool2.booleanValue();
		
		System.out.println(b3);   // 기본자료형이기 때문에 메소드 접근 불가능
		System.out.println(s3);
		System.out.println(i3);
		System.out.println(l3);
		System.out.println(f3);
		System.out.println(d3);
		System.out.println(ch3);
		System.out.println(bool3);
				
		
		
		
		
	}
}
