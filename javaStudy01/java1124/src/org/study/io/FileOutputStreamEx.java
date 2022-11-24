package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		// 출력스트림 (입력된 데이터를 파일 형태로 저장)
		try {
			FileOutputStream fout = new FileOutputStream("c:\\test.txt");
			FileInputStream fin = null;   // 출력하여 저장된 파일을 읽을 입력객체 생성
			
			for (int i=0; i<10; i++) {   // 10부터 1까지 순차적으로 fout에 입력
				int n =10-i;
				fout.write(n);
			}
			
			if (fout != null) fout.close();
			// 입력스트림으로 저장된 파일 콘솔에 출력
			fin = new FileInputStream("c:\\test.txt");
			
			int inData;
			while ((inData=fin.read()) != -1) {  // -1(입력된 문자가 끝남)이 아니면 계속 실행
				System.out.print((char)inData);
			}
			
			if (fin != null) fin.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		
	}
}
