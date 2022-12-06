package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx2 {

	public static void main(String[] args) {
		// URl의 html 읽기
		
		BufferedReader in = null;
		
		try {
			URL url = new URL("https://www.starbucks.co.kr/index.do");
			in = new BufferedReader(new InputStreamReader(url.openStream()));    // openStream : url주소를 InputStream에 저장
			
			String inData;
			while ((inData=in.readLine())!=null) {
				System.out.println(inData);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("경로 오류 !");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 오류 !");
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
