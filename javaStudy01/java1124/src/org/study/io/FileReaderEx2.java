package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		
		System.out.println("FileReader");
		
		FileReader fReader = null;
		
		try {
			fReader = new FileReader("E:\\ioex\\test2.txt");
			int c;
			while ((c=fReader.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 에러!");
		} finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("입출력 에러!");
			}
		}
	}
}
	