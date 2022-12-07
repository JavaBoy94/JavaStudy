package org.study.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.omg.CORBA.FREE_MEM;

public class BufferOutputStreamEx {

	public static void main(String[] args) {
		
		System.out.println("BufferOutputStream");
		
		FileOutputStream fos = null;
		
		FileReader fReader = null;
		
		String fileUrl = "E:\\ioex\\ioex2\\test5.txt";
		
		try {
			fos = new FileOutputStream(fileUrl);
			// BufferedOutputStream의 버퍼 크기를 5로 설정 (버퍼크기 : 한번에 입출력 가능한 크기?)
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); 
			// test5.txt에 출력(쓰기)
			for (int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			
			// test5 파일을 읽어서 콘솔에 출력
			fReader = new FileReader(fileUrl);
			int inData;
			while ((inData=fReader.read())!=-1) {
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
