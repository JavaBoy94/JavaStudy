package org.study.arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		System.out.println("==배열==");
		
		// 숫자 1~10의 배열 생성 후, for문으로 임의의 인덱스를 뽑아 100번 자리바꾸기
		// 배열의 1번째 인덱스부터 5번째 인덱스까지 콘솔에 출력 (5번 뽑기)
		
		
		int[] arr = new int[10];              // 1. 배열생성
		
		for (int i=0; i<arr.length; i++) {    // 2. for문으로 배열의 인덱스만큼 반복 (1~10)
			arr[i] = i+0;
//			System.out.println(arr[i]);
		}
		
		int temp = 0;     // 3. 빈 공간(변수) 생성
		
		for (int i=0; i<100; i++) {            // 4. 100번 반복하여 무작위로 섞기 (자료범위 : 1~10)
			int index = (int)(10*Math.random());
//			System.out.println(index);
			
			temp = arr[index];                // 5. 무작위 추출된 값을 temp에 담아둠
			arr[index] = arr[0];              // 6. 빠진 자리에 배열의 첫번째(0번째)값 넣어둠
			arr[0] = temp;                    // 7. 무작위값을 다시 0번째 자리에 넣음
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++) {
			System.out.print(arr[i]);        // 8. 무작위로 5번 뽑아 출력
		}
		
	}
}
