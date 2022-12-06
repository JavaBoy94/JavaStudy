package org.study.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEx {

	public static void main(String[] args) {
		
		System.out.println("IO");
		// 입력
		InputStream inputStream = System.in;
		// 출력 => read(예외처리 필요)
		try {
			int in = inputStream.read();   // 반환타입 : int(아스키코드)  => 캐스팅 필요(char)

			System.out.println("출력문자 : "+in);
			System.out.println("출력문자 : "+(char)in);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();   // 연결종료. close도 예외처리 필요
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
