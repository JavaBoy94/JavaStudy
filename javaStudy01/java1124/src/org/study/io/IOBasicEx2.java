package org.study.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class IOBasicEx2 {

	public static void main(String[] args) {
		
		System.out.println("I O");
		
		InputStreamReader inReader = new InputStreamReader(System.in);   // 시스템(콘솔)으로 부터 입력받음
		
		// 콘솔에서 입력 받고, -1(ctrl+Z)을 입력받으면 종료
		while (true) {
			try {
				int inData = inReader.read();
				if (inData == -1) break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			inReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
