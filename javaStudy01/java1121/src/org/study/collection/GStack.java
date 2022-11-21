package org.study.collection;

// 제네릭 타입의 스택 클래스 생성
public class GStack<T> {
	
	public int idx;   // 배열의 인덱스
	
	public Object[] oStack;  // Object 타입의 배열 생성
	
	public GStack() {
		idx = 0;
		oStack = new Object[10]; // 길이가 10인 Object 배열로 설정
	}
	
	// push 메소드 => 스택에 요소를 추가(입력)
	// 1. idx(인덱스)를 0~9까지 순차적으로 1씩 증가. 10번째가 되면 중지
	// 2. 매개변수로 입력받은 값을 oStack 배열에 추가
	
	public void push(T element) {
		if(idx==10) {
			return; // 10번지가되면 중지 (10번지 미포함)
		}
		
		oStack[idx] = element;  // 각 인덱스마다 매개변수(element)를 배열에 추가 (10개)
		
		idx++;         // 인덱스 증가 (0~9)
	}
	
	// pop 메소드 => 스택의 마지막 인덱스부터 첫번째 인덱스까지 순차적으로 값을 출력 (=> 역순 LIFO)
	
	public T pop() {
		if(idx==0) {
			return null;  // 0번지가되면 중지 
		}
		
		idx--;  // 인덱스 감소 (9~0)
		
		return (T) oStack[idx];   // 제네릭타입(T)에 맞춰 타입변환 필요 (다운캐스팅)
	}
	
}
