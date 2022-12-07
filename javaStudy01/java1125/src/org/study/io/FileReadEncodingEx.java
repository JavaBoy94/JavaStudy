package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadEncodingEx {

	public static void main(String[] args) {
		
		System.out.println("encoding");
		
		// 1. 읽을 파일을 담을 객체 생성 (불러오기)
		FileInputStream fin = null;
		// 2. 파일의 문자를 하나씩 읽어 담을 객체 생성
		InputStreamReader inReader = null;
		// 3. 읽을 파일의 경로 저장
		String fileUrl = "E:\\ioex\\ioex2\\test5.txt";
		
		try {
			// 4. 해당 경로에 있는 파일을 객체에 저장
			fin = new FileInputStream(fileUrl);
			// 5. 파일 객체의 문자열 인코딩 (예외처리 : UnsupportedEnncondingException => 지원하지 않는 인코딩 형식?)
//			inReader = new InputStreamReader(fin, "MS949");
			inReader = new InputStreamReader(fin, "UTF-8");
			
			int inData;
			while((inData=inReader.read())!=-1) {
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				inReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		
	}
}
