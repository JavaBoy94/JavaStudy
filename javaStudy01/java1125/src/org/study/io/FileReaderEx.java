package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		System.out.println("파일 입력(불러오기) => FileReader");
		
		// 1. 파일 경로 변수에 저장
		String fileUrl = "E:\\ioex\\ioex2\\test3.txt";
		
		// 2. File 객체 생성 => 파일경로 추가
		File file = new File(fileUrl);
		
		// 3. File을 읽을 객체 생성 => FileReader (예외처리 : FileNotFoundException)
		FileReader fReader = null;
		
		try {
			fReader = new FileReader(file);
			// 4. 파일 내용을 읽기  => int 변수 필요 (예외처리 : IOException)
			int c;
			// 5. 읽은 내용을 출력
			while ((c=fReader.read())!=-1) { // read()의 반환값 범위 : 0~255,-1 => 반환타입이 int
				System.out.print((char)c);  // 읽은 내용을 다시 문자(char)로 변환하여 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다 !");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다 !");
		} finally {
			// 6. 입출력 종료 (예외처리 : IOException)
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
