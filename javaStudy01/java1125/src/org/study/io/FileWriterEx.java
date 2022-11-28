package org.study.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		
		System.out.println("파일 출력(내보내기) => FileWriter");
		
		// 1. 출력할 파일에 담을 내용 입력 => 콘솔로 입력받기 (InputStreamReader)
		InputStreamReader inReader = new InputStreamReader(System.in);
		
		// 2. 생성될 파일의 경로 설정
		String fileUrl = "E:\\ioex\\ioex2\\test4.txt";
		
		// 3. 출력할 파일 객체 생성 => FileWriter   >> try 밖에서 마지막에 종료(.close())해야하므로 별도 객체 생성
		FileWriter fWriter = null; 
		
		try {
			// 4. 해당 경로에 파일 출력(생성) (예외처리 : IOException)
			fWriter = new FileWriter(fileUrl);
			int c;
			// 5. 콘솔에 입력된 내용을 파일에 쓰기(출력) => 
			while ((c=inReader.read())!=-1) {
				fWriter.write((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 6. 입출력 종료 (예외처리 : IOException)
				inReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
