package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		
		System.out.println("FileReader");
		// 외부파일 경로를 저장
		String fileName = "E:\\ioex\\test.txt";
		// 파일경로를 매개변수로 받는 File 객체 생성
		File f1 = new File(fileName);
		FileReader fReader = null;
		
		try {
			// 파일을 읽을 입력객체 생성
			fReader = new FileReader(f1);
			int inData;
			// 입력받은 내용을 한글자씩 출력
			while ((inData=fReader.read())!=-1) { 
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 에러!");
		} finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	