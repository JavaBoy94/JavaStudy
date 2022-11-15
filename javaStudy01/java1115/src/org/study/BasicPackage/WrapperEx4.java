package org.study.BasicPackage;

public class WrapperEx4 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		
		int i = 10;
		Integer i2 = new Integer(i);
		int i3 = i2.intValue();
		
		Integer i4 = 10;
		int i5 = i4;
		int i6 = new Integer(100);
		System.out.println(i4.toString());
		
		Integer i7 = new Integer("111");
		int i77 = i7.intValue();
		
		String str = "1111";
		int i8 = Integer.parseInt(str);   // java.lang에 속한 Wrapper클래스 중 하나인 Integer를 참조하여 parseInt메소드 실행
		
		Character ch10 = new Character('a');
		char ch11 = ch10.charValue();
		
	}
}
