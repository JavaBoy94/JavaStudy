package org.study.collection;

public class GenericEx1Main<T> {

	public static void main(String[] args) {
	
		GenericEx1<Integer> g1 = new GenericEx1<Integer>();
		
		// g1.t1=new Integer(10);  박싱
		g1.t1 = 10;  // 자동박싱
		System.out.println(g1.t1);
		// int num1 = g1.m1(10).intValue(); 언박싱
		int num1 = g1.m1(10);  // 자동언박싱
		
		// 제네릭타입 String
		GenericEx1<String> g2 = new GenericEx1<String>();
		
		g2.t1 = "String type";
		String str1 = g2.m1("문자열");
		
		GenericEx1<Float> g3 = new GenericEx1<Float>();
		GenericEx1<Long> g4 = new GenericEx1<Long>();
		GenericEx1<Double> g5 = new GenericEx1<Double>();
		GenericEx1<Byte> g6 = new GenericEx1<Byte>();
		GenericEx1<Short> g7 = new GenericEx1<Short>();
		GenericEx1<Character> g8 = new GenericEx1<Character>();
		GenericEx1<Boolean> g9 = new GenericEx1<Boolean>();
				

		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
}
