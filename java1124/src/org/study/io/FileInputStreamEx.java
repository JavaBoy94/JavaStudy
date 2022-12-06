package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// 파일 입력
		FileInputStream inFile = null;
		
		try {
			inFile = new FileInputStream("C:\\Windows\\system.ini");
			
			int c;
			// 입력된 inFile의 끝(-1)까지 입력  => 모든 문자/문자열은 사실 맨 끝에 -1값이 있음 (해당 문자/문자열이 끝남을 의미)
			while ((c=inFile.read()) != -1) {  
				System.out.print((char) c);
			}
			
		} catch (FileNotFoundException e) {  // 예외처리 추가 1(로드할 클래스 파일을 찾을 수 없음)
			e.printStackTrace();
			System.out.println("파일 예외");
		} catch (IOException e) {            // 예외처리 추가 2(IOException)
			e.printStackTrace();
			System.out.println("입출력 예외!");  
		} finally {
			try {
				inFile.close();   // 연결종료
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
