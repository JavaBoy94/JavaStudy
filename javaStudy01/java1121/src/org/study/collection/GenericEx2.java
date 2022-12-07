package org.study.collection;
// int 타입 클래스생성
class Gen1 {
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
// String 타입 클래스 생성
class Gen2 {
	private String num;
	public void setStr(String num) {
		this.num = num;
	}
	public String getStr() {
		return num;
	}
}
// 제네릭타입 클래스 생성 => 타입만 다른 동일한 클래스를 각각 만들 필요없이 하나의 클래스로 사용 가능 (재사용성 용이)
class Gen3<T> {
	private T num;
	public void setNum(T num) {
		this.num = num;
	}
	public T getNum() {
		return num;
	}
}

public class GenericEx2<T> {

	public static void main(String[] args) {
		
		// 일반객체 생성
		Gen1 g1 = new Gen1();
		g1.setNum(10);
		g1.getNum();
		
		Gen2 g2 = new Gen2();
		g2.setStr("root");
		g2.getStr();
		
		// 제네릭타입 객체 생성 => 기본자료형 사용불가 => Wrapper 사용
		Gen3<Integer> g3 = new Gen3<Integer>();
		
//		Integer i = 10;
//		
//		g3.setNum(new Integer(10));
//		g3.setNum(i);
		g3.setNum(10); // 제네릭은 객체형타입만 가능하기때문, 기본자료형을 넣으면 자동박싱됨
		g3.getNum();
		
		Gen3<String> g4 = new Gen3<String>();
		
		g4.setNum("root");
		g4.getNum();
		
		// 제네릭의 타입비교 => instanceof
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if (g4.getNum() instanceof String) {
			System.out.println("String");
		}
		
	}
}
