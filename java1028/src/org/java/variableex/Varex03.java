package org.java.variableex;

public class Varex03 {

	public static void main(String[] args) {
		System.out.println("변수이름 규칙");
		
//		int int;       // 키워드(예약어) 사용불가
//		int 1var;      // 첫글자에 숫자 불가
//		int m var;     // 공백불가
		int _var;
		int $var;
//		int @%%^var*;  // _, $ 이외의 특수문자 불가
		int var = 10;
		int Var = 20;
		System.out.println(var==Var);  // 대소문자 구분 (별개의 변수) >> 가급적 소문자로 시작 권장
		int varNumer;  // 둘 이상의 단어조합시 대문자로 구분 (가독성)
		int 변수 = 100;        
		System.out.println(변수);       // 가급적 영어사용 권장  (추후 통신 과정에서 오류발생 가능)
		

	}

}
