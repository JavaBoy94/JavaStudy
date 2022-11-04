package org.study.arrayEx;

public class ArrayEx07 {

	public static void main(String[] args) {

		System.out.println("char배열 >> String");

		char ch[] = {'C', 'A', 'F', 'E'};
		
		System.out.println("ch= "+new String(ch));
		System.out.println("ch= "+String.valueOf(ch));
		
		
		// char 배열 자료로 string 배열에 대응하는 자료(바이너리 코드) 출력하기?
		String binnery[] = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
		};
		
		String result = "";
		
		for (int i=0; i<ch.length; i++) {             // for문으로 ch배열의 길이(4개)만큼 실행(0~3)
			if (ch[i] >= '0' && ch[i] <= '9') {       // 아스키코드에서 크기는 '숫자<알파벳' => 무조건 알파벳문자가 더 큼 !
				result += binnery[ch[i] - '0'];       // if 조건은 해당사항 X => else 실행
			} else {
				result += binnery[ch[i] - 'A' + 10];  // (ch배열의 i번째 인덱스값 - 'A' + 10)값에 해당하는 binnery배열의 인덱스값을 result변수에 누적하여 저장
			}                                         // => 12("1100"), 10("1010"), 15("1111"), 14("1110")순으로 result에 누적저장
		}

		System.out.println(result);

	}
}
