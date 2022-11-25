package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputR {

	public static void main(String[] args) {
		
		// 국,영,수 3과목 점수 입력받아 평균점수 출력
		
 		// 문자단위 입출력 => Reader						
		InputStreamReader reader = null; 	// 바이트단위인 inputStream으로 문자(char)를 입출력 할 시 일부 문자가 깨질 수 있음 => 문자 단위인 InputStreamReader 사용  
											// try 바깥에 빈객체를 먼저 생성하는 이유 : finally문에서 해당 입출력 객체를 종료해야 하기 때문
		
		try {
			// 콘솔로 입력받기
			System.out.print("이름 입력 :");
			reader = new InputStreamReader(System.in); 
			// 버퍼로 입력받아 속도차이 완화
			BufferedReader in = new BufferedReader(reader);
			// 버퍼에서 읽은(입력된) 문자 저장
			String name = in.readLine();
			// 3과목에 대한 배열 생성
			String[] stu = {"국어", "영어", "수학"};
			// 3과목별 점수를 담을 배열 생성
			int[] score = new int[3];
			// 점수합계 객체 생성
			double sum = 0.0;
			
			System.out.println("하이~ "+name+"! 점수 입력해라");
			// 3과목 점수 입력
			for (int i=0; i<stu.length; i++) {
				// 과목별 점수 입력
				System.out.print(stu[i]+" : ");
				String scoreIn = in.readLine();   // Line();은 개행(\n)포함 => 마지막에 엔터 필수
				score[i] = Integer.parseInt(scoreIn); // 입력받은 점수를 Integer로 변환 후 score 배열에 저장 
				sum += score[i];
			}
			System.out.println("국어 : "+score[0]+" / 영어 : "+score[1]+" / 수학 : "+score[2]);
			System.out.println("평균 : "+Math.round(sum/score.length));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
